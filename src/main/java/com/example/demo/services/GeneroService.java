package com.example.demo.services;

import com.example.demo.models.Genero;

import java.util.List;
import java.util.Optional;

public interface GeneroService {

    public List<Genero> findAll();

    public Optional<Genero> findById(Long id);

    public Genero save(Genero genero);

    public void deleteById(Long id);

}
