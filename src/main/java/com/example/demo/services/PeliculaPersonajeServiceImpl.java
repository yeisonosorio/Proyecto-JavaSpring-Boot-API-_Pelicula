package com.example.demo.services;

import com.example.demo.models.PeliculaPersonaje;
import com.example.demo.repositories.PeliculaPersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PeliculaPersonajeServiceImpl implements PeliculaPersonajeService {

    @Autowired
    private PeliculaPersonajeRepository repository;

    @Override
    public List<PeliculaPersonaje> findAll() {
        return (List<PeliculaPersonaje>) repository.findAll();
    }

    @Override
    public PeliculaPersonaje findBy(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public PeliculaPersonaje save(PeliculaPersonaje peliculaPersonaje) {
        return repository.save(peliculaPersonaje);
    }

    @Override
    public void delete(Long id) { repository.deleteById(id);
    }
}
