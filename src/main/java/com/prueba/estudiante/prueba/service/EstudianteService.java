package com.prueba.estudiante.prueba.service;

import com.prueba.estudiante.prueba.config.ResourceNotFoundException;
import com.prueba.estudiante.prueba.entity.Docente;
import com.prueba.estudiante.prueba.entity.Estudiante;

import java.util.List;

public interface EstudianteService {

    List<Estudiante> findAllEstudiante();
    Estudiante findEstudianteById(Long id) throws ResourceNotFoundException;
    Estudiante createEstudiante(Estudiante estudiante);
    Estudiante updateEstudiante(Long id, Estudiante estudianteNew) throws ResourceNotFoundException;
    void deleteEstudiante(Long id) throws ResourceNotFoundException;
}
