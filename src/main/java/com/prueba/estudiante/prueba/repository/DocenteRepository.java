package com.prueba.estudiante.prueba.repository;

import com.prueba.estudiante.prueba.entity.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
}
