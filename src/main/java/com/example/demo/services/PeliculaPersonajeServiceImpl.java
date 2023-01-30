package com.example.demo.services;

import com.example.demo.models.PeliculaPersonaje;
import com.example.demo.repositories.PeliculaPersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PeliculaPersonajeServiceImpl implements PeliculaPersonajeService {

    @Autowired
    private PeliculaPersonajeRepository peliculaPersonajeRepository;

    public PeliculaPersonajeServiceImpl(PeliculaPersonajeRepository peliculaPersonajeRepository) {
        this.peliculaPersonajeRepository = peliculaPersonajeRepository;
    }

    @Override
    public List<PeliculaPersonaje> findAll() {
        return  peliculaPersonajeRepository.findAll();
    }

    @Override
    public Optional<PeliculaPersonaje> findBy(Long id) {
        return peliculaPersonajeRepository.findById(id);
    }

    @Override
    public PeliculaPersonaje save(PeliculaPersonaje peliculaPersonaje) {
        return peliculaPersonajeRepository.save(peliculaPersonaje);
    }

    @Override
    public void deleteById(Long id) {
        peliculaPersonajeRepository.deleteById(id);
    }
}
