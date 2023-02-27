package com.prueba.estudiante.prueba.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EstudianteDTO {

    private String tipoDocumento;
    private Long numeroIdentidad;
    private String nombres;
    private String apellidos;
    private Long gradoMatriculado;

}
