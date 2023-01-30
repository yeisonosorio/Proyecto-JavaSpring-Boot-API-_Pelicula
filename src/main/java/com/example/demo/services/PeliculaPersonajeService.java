package com.example.demo.services;


import com.example.demo.models.PeliculaPersonaje;

import java.util.List;
import java.util.Optional;

public interface PeliculaPersonajeService {

    public List<PeliculaPersonaje> findAll();

    public Optional<PeliculaPersonaje> findBy(Long id);

    public PeliculaPersonaje save(PeliculaPersonaje peliculaPersonaje);

    public void deleteById(Long id);
}
