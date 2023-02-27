package com.prueba.estudiante.prueba.config;

import com.prueba.estudiante.prueba.dto.DocenteDTO;
import com.prueba.estudiante.prueba.dto.EstudianteDTO;
import com.prueba.estudiante.prueba.entity.Docente;
import com.prueba.estudiante.prueba.entity.Estudiante;
import org.modelmapper.ModelMapper;

public class EstudianteMapper {

    public static final ModelMapper modelMapper = new ModelMapper();

    public static Estudiante toEstudiante(EstudianteDTO estudianteDTO) {
        return modelMapper.map(estudianteDTO, Estudiante.class);
    }

    public static EstudianteDTO toEstudianteDTO(Estudiante estudiante) {
        return modelMapper.map(estudiante, EstudianteDTO.class);
    }
}
