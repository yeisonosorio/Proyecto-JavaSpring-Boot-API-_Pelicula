package com.example.demo.services;

import com.example.demo.models.Genero;
import com.example.demo.models.Personaje;

import java.util.List;

public interface PersonajeService {


    public List<Personaje> findAll();

    public Personaje findBy(Long id);

    public Personaje save(Personaje personaje);

    public void delete(Long id);

}
