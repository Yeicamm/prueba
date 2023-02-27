package com.prueba.estudiante.prueba.controller;



import com.prueba.estudiante.prueba.entity.Estudiante;
import com.prueba.estudiante.prueba.service.EstudianteService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping("/api/estudiante")
@RequiredArgsConstructor
public class EstudianteController {

    private EstudianteService estudianteService;

    public EstudianteController(EstudianteService estudianteService) {
        this.estudianteService = estudianteService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> findEstudianteById(@PathVariable Long id) {
        Estudiante estudiante = estudianteService.findEstudianteById(id);
        return ResponseEntity.ok(estudiante);
    }

    @GetMapping
    public ResponseEntity<List<Estudiante>> findAllEstudiante() {
        List<Estudiante> estudiantes = estudianteService.findAllEstudiante();
        return new ResponseEntity<>(estudiantes, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Estudiante> createEstudiante(@RequestBody Estudiante estudiante) {
        Estudiante estudiante1 = estudianteService.createEstudiante(estudiante);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("estudiante", "/api/estudiante" + estudiante1.getId().toString());
        return new ResponseEntity<>(estudiante1, httpHeaders, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> updateEstudiante(@PathVariable Long id, @RequestBody Estudiante estudiante) {
        estudianteService.updateEstudiante(id, estudiante);
        return new ResponseEntity<>(estudianteService.findEstudianteById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudiante(@PathVariable Long id) {
        estudianteService.deleteEstudiante(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
