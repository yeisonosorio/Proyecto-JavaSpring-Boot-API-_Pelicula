package com.example.demo.services;

import com.example.demo.models.Genero;
import com.example.demo.models.Personaje;

import java.util.List;
import java.util.Optional;

public interface PersonajeService {


    public List<Personaje> findAll();

    public Optional<Personaje> findBy(Long id);

    public Personaje save(Personaje personaje);

    public void deleteById(Long id);

}
