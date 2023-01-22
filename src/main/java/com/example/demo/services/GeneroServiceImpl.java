package com.example.demo.services;

import com.example.demo.models.Genero;
import com.example.demo.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class GeneroServiceImpl implements GeneroService {

    //inyeccion de dependencia
    @Autowired
    private GeneroRepository repository;

    @Override
    public List<Genero> findAll() {
        return (List<Genero>) repository.findAll();
    }

    @Override
    public Genero findBy(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Genero save(Genero genero) {
        return repository.save(genero);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }


}
