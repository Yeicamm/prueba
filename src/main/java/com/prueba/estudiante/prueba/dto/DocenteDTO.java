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
    @Column(name = "DOCENTE_TIPODOCUMENTO")
    private String tipoDocumento;
    @Column (name = "DOCENTE_NUMEROIDENTIDAD")
    private Long numeroIdentidad;
    @Column (name = "DOCENTE_NOMBRES")
    private String nombres;
    @Column (name = "DOCENTE_APELLIDOS")
    private String apellidos;
    @Column (name = "DOCENTE_ASIGNATURADICTADA")
    private Long asignaturaDicatada;

    private List<Asignatura> asignaturas;
}
