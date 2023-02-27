package com.prueba.estudiante.prueba.dto;

import com.prueba.estudiante.prueba.entity.Asignatura;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DocenteDTO {
    private String tipoDocumento;
    private Long numeroIdentidad;
    private String nombres;
    private String apellidos;
    private Long asignaturaDictada;
    private List<Asignatura> asignaturas;
}
