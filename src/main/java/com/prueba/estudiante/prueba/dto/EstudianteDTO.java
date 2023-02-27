package com.prueba.estudiante.prueba.dto;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "estudianteDTO")
public class EstudianteDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ESTUDIANTEDTO_TIPODOCUMENTO")
    private String tipoDocumento;
    @Column (name = "ESTUDIANTEDTO_NUMEROIDENTIDAD")
    private Long numeroIdentidad;
    @Column (name = "ESTUDIANTEDTO_NOMBRES")
    private String nombres;
    @Column (name = "ESTUDIANTEDTO_APELLIDOS")
    private String apellidos;
    @Column (name = "ESTUDIANTEDTO_GRADOMATRICULADO")
    private Long gradoMatriculado;

}
