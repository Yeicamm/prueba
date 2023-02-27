package com.prueba.estudiante.prueba.service.impl;

import com.prueba.estudiante.prueba.config.ResourceNotFoundException;

import com.prueba.estudiante.prueba.entity.Estudiante;
import com.prueba.estudiante.prueba.repository.EstudianteRepository;
import com.prueba.estudiante.prueba.service.EstudianteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service

public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public Estudiante createEstudiante(Estudiante estudiante) {
        Estudiante estudiantenew = estudianteRepository.save(estudiante);
        return estudiantenew;
    }

    @Override
    public List<Estudiante> findAllEstudiante() {
        List<Estudiante> estudiantes = new ArrayList<>();
        estudianteRepository.findAll().forEach(estudiantes::add);
        return estudiantes;
    }

    @Override
    public Estudiante findEstudianteById(Long id) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        return estudianteRepository.findById(id).get();
    }

    @Override
    public void deleteEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }

    @Override
    public Estudiante updateEstudiante(Long id, Estudiante estudianteNew) {
        Estudiante estudiante = estudianteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Estudiante no encontrada con id " + id));
        estudiante.setTipoDocumento(estudiante.getTipoDocumento());
        estudiante.setNumeroIdentidad(estudiante.getNumeroIdentidad());
        estudiante.setNombres(estudiante.getNombres());
        estudiante.setApellidos(estudiante.getApellidos());
        estudiante.setFechaNacimiento(estudiante.getFechaNacimiento());
        estudiante.setGradoMatriculado(estudiante.getGradoMatriculado());
        estudiante.setCiudadResidencia(estudiante.getCiudadResidencia());
        estudiante.setDireccionResidencia(estudiante.getDireccionResidencia());
        estudiante.setEmail(estudiante.getEmail());
        estudiante.setTelefonoFijo(estudiante.getTelefonoFijo());
        estudiante.setCelular(estudiante.getCelular());
        estudiante.setNombreCompleto(estudiante.getNombreCompleto());
        estudiante.setNombreCompletoAcudiente(estudiante.getNombreCompletoAcudiente());
        return estudianteRepository.save(estudiante);
    }

}
