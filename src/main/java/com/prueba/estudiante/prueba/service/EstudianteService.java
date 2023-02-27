package com.prueba.estudiante.prueba.service;

import com.prueba.estudiante.prueba.config.ResourceNotFoundException;
import com.prueba.estudiante.prueba.dto.DocenteDTO;
import com.prueba.estudiante.prueba.dto.EstudianteDTO;

import java.util.List;

public interface EstudianteService {

    List<EstudianteDTO> findAllEstudiante();
    EstudianteDTO findEstudianteById(Long id) throws ResourceNotFoundException;
    EstudianteDTO createEstudiante(EstudianteDTO estudianteDTO);
    EstudianteDTO updateEstudiante(Long id, EstudianteDTO estudianteDTO) throws ResourceNotFoundException;
    void deleteEstudiante(Long id) throws ResourceNotFoundException;
}
