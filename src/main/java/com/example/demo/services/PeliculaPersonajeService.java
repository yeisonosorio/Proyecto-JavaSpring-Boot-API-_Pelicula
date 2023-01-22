package com.example.demo.services;


import com.example.demo.models.PeliculaPersonaje;

import java.util.List;

public interface PeliculaPersonajeService {

    public List<PeliculaPersonaje> findAll();

    public PeliculaPersonaje findBy(Long id);

    public PeliculaPersonaje save(PeliculaPersonaje peliculaPersonaje);

    public void delete(Long id);
}
