package com.prueba.estudiante.prueba.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Getter
@Table (name = "estudiante")
public class Estudiante {
    @Setter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Column (name = "ESTUDIANTE_TIPODOCUMENTO")
    private String tipoDocumento;
    @Setter
    @Column (name = "ESTUDIANTE_NUMEROIDENTIDAD")
    private Long numeroIdentidad;
    @Setter
    @Column (name = "ESTUDIANTE_NOMBRES")
    private String nombres;
    @Setter
    @Column (name = "ESTUDIANTE_APELLIDOS")
    private String apellidos;
    @Setter
    @Column (name = "ESTUDIANTE_FECHANACIMIENTO")
    private LocalDate fechaNacimiento;
    @Setter
    @Column (name = "ESTUDIANTE_GRADOMATRICULADO")
    private Long gradoMatriculado;
    @Setter
    @Column (name = "ESTUDIANTE_CIUDADRESIDENCIA")
    private String ciudadResidencia;
    @Setter
    @Column (name = "ESTUDIANTE_DIRECCIONRESIDENCIA")
    private String direccionResidencia;
    @Setter
    @Column (name = "ESTUDIANTE_EMAIL")
    private String email;
    @Setter
    @Column (name = "ESTUDIANTE_TELEFONOFIJO")
    private Long telefonoFijo;
    @Setter
    @Column (name = "ESTUDIANTE_CELULAR")
    private Long celular;
    @Column (name = "ESTUDIANTE_NOMBRECOMPLETO")
    private String nombreCompleto;
    @Setter
    @Column (name = "ESTUDIANTE_NOMBRECOMPLETOACUDIENTE")
    private String nombreCompletoAcudiente;
    @Setter
    @ManyToMany(mappedBy = "estudiantes")
    private Set<Asignatura> asignaturas = new HashSet<>();
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = this.nombres + " " + this.apellidos;
    }
}
