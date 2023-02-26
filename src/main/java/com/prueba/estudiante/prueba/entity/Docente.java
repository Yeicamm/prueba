package com.prueba.estudiante.prueba.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Setter
@Table (name = "docente")
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (name = "DOCENTE_TIPODOCUMENTO")
    private String tipoDocumento;
    @Column (name = "DOCENTE_NUMEROIDENTIDAD")
    private Long numeroIdentidad;
    @Column (name = "DOCENTE_NOMBRES")
    private String nombres;
    @Column (name = "DOCENTE_APELLIDOS")
    private String apellidos;
    @Column (name = "DOCENTE_FECHANACIMIENTO")
    private LocalDate fechaNacimiento;
    @Column (name = "DOCENTE_ASIGNATURADICTADA")
    private Long asignaturaDicatada;
    @Column (name = "DOCENTE_CIUDADRESIDENCIA")
    private String ciudadResidencia;
    @Column (name = "DOCENTE_ULTIMOGRADOESCOLARIDAD")
    private String ultimoGradoEscolaridad;
    @Column (name = "DOCENTE_GRADORESPONSABLE")
    private String gradoRespondable;
    @Column (name = "DOCENTE_EMAIL")
    private String email;
    @Column (name = "DOCENTE_TELEFONOFIJO")
    private Long telefonoFijo;
    @Column (name = "DOCENTE_CELULAR")
    private Long celular;
}
