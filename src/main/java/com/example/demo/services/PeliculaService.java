package com.example.demo.services;


import com.example.demo.models.Pelicula;

import java.util.List;
import java.util.Optional;

public interface PeliculaService {

    public List<Pelicula> findAll();

    public Optional<Pelicula> findBy(Long id);

    public Pelicula save(Pelicula pelicula);

    public void deleteById(Long id);

}
