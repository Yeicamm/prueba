package com.prueba.estudiante.prueba.config;

import com.prueba.estudiante.prueba.dto.DocenteDTO;
import com.prueba.estudiante.prueba.entity.Docente;
import org.modelmapper.ModelMapper;

public class DocenteMapper {

    public static final ModelMapper modelMapper = new ModelMapper();

    public static Docente toDocente(DocenteDTO docenteDTO) {
        return modelMapper.map(docenteDTO, Docente.class);
    }

    public static DocenteDTO toDocenteDTO(Docente docente) {
        return modelMapper.map(docente, DocenteDTO.class);
    }

}
