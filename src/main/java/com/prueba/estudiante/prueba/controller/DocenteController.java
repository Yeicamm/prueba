package com.prueba.estudiante.prueba.controller;


import com.prueba.estudiante.prueba.service.DocenteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/docente")
@RequiredArgsConstructor
public class DocenteController {
/*
    private DocenteService docenteService;
    private ModelMapper modelMapper;

    public DocenteDTO convertToDto(Object docente) {
        DocenteDTO docenteDTO = modelMapper.map(docente, DocenteDTO.class);
        // lógica para asignar valores adicionales a docenteDTO
        return docenteDTO;
    }
    @GetMapping("/{id}")
    public ResponseEntity<DocenteDTO> findDocenteById(@PathVariable Long id) {
        DocenteDTO docenteDTO = docenteService.findDocenteById(id);
        return ResponseEntity.ok(docenteDTO);
    }

    @GetMapping("/docente")
    public ResponseEntity<List<DocenteDTO>> findAllDocente() {
        List<DocenteDTO> docenteDTO = docenteService.findAllDocentes()
                .stream()
                .map(asignatura -> convertToDto(asignatura))
                .collect(Collectors.toList());
        return ResponseEntity.ok(docenteDTO);
    }

    @PostMapping
    public ResponseEntity<DocenteDTO> createDocente(@RequestBody DocenteDTO docenteDTO) {
        DocenteDTO createdDocenteDTO = docenteService.createDocente(docenteDTO);
        return ResponseEntity.ok(createdDocenteDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DocenteDTO> updateDocente(@PathVariable Long id, @RequestBody DocenteDTO docenteDTO) {
        DocenteDTO updatedDocenteDTO = docenteService.updateDocente(id, docenteDTO);
        return ResponseEntity.ok(updatedDocenteDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDocente(@PathVariable Long id) {
        docenteService.deleteDocente(id);
        return ResponseEntity.noContent().build();
    }

 */
}
