package com.prueba.estudiante.prueba.controller;

import com.prueba.estudiante.prueba.service.AsignaturaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/asignaturas")
@RequiredArgsConstructor
public class AsignaturaController {
/*
    private AsignaturaService asignaturaService;
    private ModelMapper modelMapper;

    public AsignaturaDTO convertToDto(AsignaturaDTO asignatura) {
        AsignaturaDTO asignaturaDTO = modelMapper.map(asignatura, AsignaturaDTO.class);
        // lógica para asignar valores adicionales a asignaturaDTO
        return asignaturaDTO;
    }
    @GetMapping("/{id}")
    public ResponseEntity<AsignaturaDTO> findAsignaturaById(@PathVariable Long id) {
        AsignaturaDTO asignaturaDTO = asignaturaService.findAsignaturaById(id);
        return ResponseEntity.ok(asignaturaDTO);
    }

    @GetMapping("/asignaturas")
    public ResponseEntity<List<AsignaturaDTO>> findAllAsignaturas() {
        List<AsignaturaDTO> asignaturasDTO = asignaturaService.findAllAsignatura()
                .stream()
                .map(asignatura -> convertToDto(asignatura))
                .collect(Collectors.toList());
        return ResponseEntity.ok(asignaturasDTO);
    }

    @PostMapping
    public ResponseEntity<AsignaturaDTO> createAsignatura(@RequestBody AsignaturaDTO asignaturaDTO) {
        AsignaturaDTO createdAsignaturaDTO = asignaturaService.createAsignatura(asignaturaDTO);
        return ResponseEntity.ok(createdAsignaturaDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<AsignaturaDTO> updateAsignatura(@PathVariable Long id, @RequestBody AsignaturaDTO asignaturaDTO) {
        AsignaturaDTO updatedAsignaturaDTO = asignaturaService.updateAsignatura(id, asignaturaDTO);
        return ResponseEntity.ok(updatedAsignaturaDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAsignatura(@PathVariable Long id) {
        asignaturaService.deleteAsignatura(id);
        return ResponseEntity.noContent().build();
    }

 */
}