package com.example.demo.services;

import com.example.demo.models.Genero;
import java.util.List;

public interface GeneroService {

    public List<Genero> findAll();

    public Genero findBy(Long id);

    public Genero save(Genero genero);

    public void delete(Long id);

}
