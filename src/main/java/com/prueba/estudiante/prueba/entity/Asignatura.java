package com.prueba.estudiante.prueba.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "asignatura")
@Setter
public class Asignatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ASIGNATURA_DOCENTEDICTA")
    private String DocenteDicta;
    @Column(name = "ASIGNATURA_DESCRIPCION")
    private String Descripcion;
    @ManyToMany
    @JoinTable(
            name = "estudiante_asignatura",
            joinColumns = @JoinColumn(name = "asignatura_id"),
            inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    private Set<Estudiante> estudiantes = new HashSet<>();

}
