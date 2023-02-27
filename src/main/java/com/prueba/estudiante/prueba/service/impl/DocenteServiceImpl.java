package com.prueba.estudiante.prueba.service.impl;

import com.prueba.estudiante.prueba.config.ResourceNotFoundException;
import com.prueba.estudiante.prueba.entity.Docente;
import com.prueba.estudiante.prueba.repository.DocenteRepository;
import com.prueba.estudiante.prueba.service.DocenteService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DocenteServiceImpl implements DocenteService {
/*
    private DocenteRepository docenteRepository;

    private ModelMapper modelMapper;

    @Override
    public DocenteDTO createDocente(DocenteDTO docenteDTO) {
        Docente docente = modelMapper.map(docenteDTO, Docente.class);
        docente = docenteRepository.save(docente);
        return modelMapper.map(docente, DocenteDTO.class);
    }

    @Override
    public List<DocenteDTO> findAllDocentes() {
        List<Docente> docentes = docenteRepository.findAll();
        return docentes.stream().map(docente -> modelMapper.map(docente, DocenteDTO.class)).collect(Collectors.toList());
    }

    @Override
    public DocenteDTO findDocenteById(Long id) {
        Optional<Docente> docente = docenteRepository.findById(id);
        return docente.map(value -> modelMapper.map(value, DocenteDTO.class)).orElse(null);
    }

    @Override
    public void deleteDocente(Long id) {
        docenteRepository.deleteById(id);
    }

    @Override
    public DocenteDTO updateDocente(Long id, DocenteDTO docenteDTO) {
        Docente docente = docenteRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Docente no encontrada con id " + id));
        docente.setTipoDocumento(docenteDTO.getTipoDocumento());
        docente.setNumeroIdentidad(docenteDTO.getNumeroIdentidad());
        docente.setNombres(docenteDTO.getNombres());
        docente.setApellidos(docenteDTO.getApellidos());
        docente.setAsignaturas(docenteDTO.getAsignaturas());
        docente.setAsignaturaDictada(docenteDTO.getAsignaturaDictada());

        return modelMapper.map(docente, DocenteDTO.class);
    }

 */
}
