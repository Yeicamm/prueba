package com.prueba.estudiante.prueba.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
}
