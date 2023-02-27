package com.prueba.estudiante.prueba.service.impl;

import com.prueba.estudiante.prueba.config.ResourceNotFoundException;
import com.prueba.estudiante.prueba.dto.EstudianteDTO;
import com.prueba.estudiante.prueba.entity.Estudiante;
import com.prueba.estudiante.prueba.repository.EstudianteRepository;
import com.prueba.estudiante.prueba.service.EstudianteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EstudianteServiceImpl implements EstudianteService {

    private EstudianteRepository estudianteRepository;

    private ModelMapper modelMapper;

    @Override
    public EstudianteDTO createEstudiante(EstudianteDTO estudianteDTO) {
        Estudiante estudiante = modelMapper.map(estudianteDTO, Estudiante.class);
        estudiante = estudianteRepository.save(estudiante);
        return modelMapper.map(estudiante, EstudianteDTO.class);
    }

    @Override
    public List<EstudianteDTO> findAllEstudiante() {
        List<Estudiante> estudiantes = estudianteRepository.findAll();
        return estudiantes.stream().map(estudiante -> modelMapper.map(estudiante, EstudianteDTO.class)).collect(Collectors.toList());
    }

    @Override
    public EstudianteDTO findEstudianteById(Long id) {
        Optional<Estudiante> estudiante = estudianteRepository.findById(id);
        return estudiante.map(value -> modelMapper.map(value, EstudianteDTO.class)).orElse(null);
    }

    @Override
    public void deleteEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }

    @Override
    public EstudianteDTO updateEstudiante(Long id, EstudianteDTO estudianteDTO) {
        Estudiante estudiante = estudianteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Estudiante no encontrada con id " + id));
        estudiante.setTipoDocumento(estudianteDTO.getTipoDocumento());
        estudiante.setNumeroIdentidad(estudianteDTO.getNumeroIdentidad());
        estudiante.setNombres(estudianteDTO.getNombres());
        estudiante.setApellidos(estudianteDTO.getApellidos());
        estudiante.setGradoMatriculado(estudianteDTO.getGradoMatriculado());
        return modelMapper.map(estudiante, EstudianteDTO.class);
    }

}
