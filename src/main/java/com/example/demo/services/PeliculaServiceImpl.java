package com.example.demo.services;

import com.example.demo.models.Pelicula;
import com.example.demo.repositories.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PeliculaServiceImpl implements PeliculaService {

    @Autowired
    private PeliculaRepository repository;

    @Override
    public List<Pelicula> findAll() {
        return (List<Pelicula>) repository.findAll();
    }

    @Override
    public Pelicula findBy(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Pelicula save(Pelicula pelicula) {
        return repository.save(pelicula);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
