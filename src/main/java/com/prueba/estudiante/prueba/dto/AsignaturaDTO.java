package com.prueba.estudiante.prueba.dto;

import com.prueba.estudiante.prueba.entity.Docente;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AsignaturaDTO {

    private String nombre;
    private String docenteDicta;
    private String descripcion;
    private DocenteDTO docenteDTO;
}
