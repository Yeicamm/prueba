package com.prueba.estudiante.prueba.service.impl;

import com.prueba.estudiante.prueba.config.ResourceNotFoundException;
import com.prueba.estudiante.prueba.entity.Asignatura;
import com.prueba.estudiante.prueba.repository.AsignaturaRepository;
import com.prueba.estudiante.prueba.service.AsignaturaService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AsignaturaServiceImpl implements AsignaturaService {

/*
    private AsignaturaRepository asignaturaRepository;

    private ModelMapper modelMapper;

    @Override
    public AsignaturaDTO createAsignatura(AsignaturaDTO asignaturaDTO) {
        Asignatura asignatura = modelMapper.map(asignaturaDTO, Asignatura.class);
        asignatura = asignaturaRepository.save(asignatura);
        return modelMapper.map(asignatura, AsignaturaDTO.class);
    }

    @Override
    public List<AsignaturaDTO> findAllAsignatura() {
        List<Asignatura> asignaturas = asignaturaRepository.findAll();
        return asignaturas.stream().map(asignatura -> modelMapper.map(asignatura, AsignaturaDTO.class)).collect(Collectors.toList());
    }

    @Override
    public AsignaturaDTO findAsignaturaById(Long id) {
        Optional<Asignatura> asignatura = asignaturaRepository.findById(id);
        return asignatura.map(value -> modelMapper.map(value, AsignaturaDTO.class)).orElse(null);
    }

    @Override
    public void deleteAsignatura(Long id) {
        asignaturaRepository.deleteById(id);
    }

    @Override
    public AsignaturaDTO updateAsignatura(Long id, AsignaturaDTO asignaturaDTO) {
        Asignatura asignatura = asignaturaRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Asignatura no encontrada con id " + id));
        asignatura.setNombre(asignaturaDTO.getNombre());
        asignatura.setDescripcion(asignaturaDTO.getDescripcion());
        asignatura.setDocenteDicta(asignaturaDTO.getDocenteDicta());
        asignatura = asignaturaRepository.save(asignatura);
        return modelMapper.map(asignatura, AsignaturaDTO.class);
    }

 */

}
