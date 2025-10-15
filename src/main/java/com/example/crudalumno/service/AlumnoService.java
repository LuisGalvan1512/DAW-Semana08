package com.example.crudalumno.service;

import com.example.crudalumno.entity.Alumno;
import com.example.crudalumno.repository.AlumnoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AlumnoService {

    private final AlumnoRepository repo;

    public AlumnoService(AlumnoRepository repo) {
        this.repo = repo;
    }

    public List<Alumno> listar() {
        return repo.findAll();
    }

    public Alumno guardar(Alumno a) {
        return repo.save(a);
    }

    public Alumno obtenerPorId(Long id) {
        return repo.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repo.deleteById(id);
    }
}
