package com.example.demo.services;

import com.example.demo.models.Personaje;
import com.example.demo.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeRepository repository;

    @Override
    public List<Personaje> findAll() {
        return (List<Personaje>) repository.findAll();
    }

    @Override
    public Personaje findBy(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Personaje save(Personaje personaje) {
        return repository.save(personaje);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
