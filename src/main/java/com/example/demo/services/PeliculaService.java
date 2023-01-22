package com.example.demo.services;


import com.example.demo.models.Pelicula;

import java.util.List;

public interface PeliculaService {

    public List<Pelicula> findAll();

    public Pelicula findBy(Long id);

    public Pelicula save(Pelicula pelicula);

    public void delete(Long id);

}
