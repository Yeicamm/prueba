package com.prueba.estudiante.prueba.config;

import com.prueba.estudiante.prueba.dto.AsignaturaDTO;
import com.prueba.estudiante.prueba.dto.DocenteDTO;
import com.prueba.estudiante.prueba.entity.Asignatura;
import com.prueba.estudiante.prueba.entity.Docente;
import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;


public class AsiganturaMapper {

    public static final ModelMapper modelMapper = new ModelMapper();

    public static Asignatura toAsignatura(AsignaturaDTO asignaturaDTO) {
        return modelMapper.map(asignaturaDTO, Asignatura.class);
    }

    public static AsignaturaDTO toAsignaturaDTO(Asignatura asignatura) {
        return modelMapper.map(asignatura, AsignaturaDTO.class);
    }

}
