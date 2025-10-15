package com.example.crudalumno.controller;

import com.example.crudalumno.entity.Alumno;
import com.example.crudalumno.service.AlumnoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@CrossOrigin(origins = "*")
public class AlumnoController {

    private final AlumnoService service;

    public AlumnoController(AlumnoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Alumno> listar() {
        return service.listar();
    }

    @PostMapping
    public Alumno guardar(@RequestBody Alumno alumno) {
        return service.guardar(alumno);
    }

    @GetMapping("/{id}")
    public Alumno obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PutMapping("/{id}")
    public Alumno actualizar(@PathVariable Long id, @RequestBody Alumno alumno) {
        Alumno existente = service.obtenerPorId(id);
        if (existente != null) {
            existente.setNombre(alumno.getNombre());
            existente.setApellido(alumno.getApellido());
            existente.setCarrera(alumno.getCarrera());
            existente.setPromedio(alumno.getPromedio());
            return service.guardar(existente);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
