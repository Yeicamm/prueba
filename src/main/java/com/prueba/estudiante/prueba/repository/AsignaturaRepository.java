package com.prueba.estudiante.prueba.repository;

import com.prueba.estudiante.prueba.entity.Asignatura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignaturaRepository extends JpaRepository<Asignatura, Long> {

}
