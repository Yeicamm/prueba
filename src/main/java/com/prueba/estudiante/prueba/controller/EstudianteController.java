package com.prueba.estudiante.prueba.controller;


import com.prueba.estudiante.prueba.dto.EstudianteDTO;
import com.prueba.estudiante.prueba.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/estudiante")
@RequiredArgsConstructor
public class EstudianteController {

    private EstudianteService estudianteService;
    private ModelMapper modelMapper;

    public EstudianteDTO convertToDto(Object estudiante) {
        EstudianteDTO estudianteDTO = modelMapper.map(estudiante, EstudianteDTO.class);
        // lógica para asignar valores adicionales a docenteDTO
        return estudianteDTO;
    }
    @GetMapping("/{id}")
    public ResponseEntity<EstudianteDTO> findEstudianteById(@PathVariable Long id) {
        EstudianteDTO estudianteDTO = estudianteService.findEstudianteById(id);
        return ResponseEntity.ok(estudianteDTO);
    }

    @GetMapping("/estudiante")
    public ResponseEntity<List<EstudianteDTO>> findAllEstudiante() {
        List<EstudianteDTO> estudianteDTO = estudianteService.findAllEstudiante()
                .stream()
                .map(estudiante -> convertToDto(estudiante))
                .collect(Collectors.toList());
        return ResponseEntity.ok(estudianteDTO);
    }

    @PostMapping("/agregar")
    public ResponseEntity<EstudianteDTO> createEstudiante(@RequestBody EstudianteDTO estudianteDTO) {
        EstudianteDTO createdEstudianteDTO = estudianteService.createEstudiante(estudianteDTO);
        return ResponseEntity.ok(createdEstudianteDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<EstudianteDTO> updateEstudiante(@PathVariable Long id, @RequestBody EstudianteDTO estudianteDTO) {
        EstudianteDTO updatedEstudianteDTO = estudianteService.updateEstudiante(id, estudianteDTO);
        return ResponseEntity.ok(updatedEstudianteDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEstudiante(@PathVariable Long id) {
        estudianteService.deleteEstudiante(id);
        return ResponseEntity.noContent().build();
    }
}
