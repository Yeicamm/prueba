package com.prueba.estudiante.prueba.repository;

import com.prueba.estudiante.prueba.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
