package com.example.demo.services;

import com.example.demo.models.Genero;
import com.example.demo.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class GeneroServiceImpl implements GeneroService {

    //inyeccion de dependencia
    @Autowired
    private GeneroRepository generoRepository;


    public GeneroServiceImpl(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    @Override
    public List<Genero> findAll() {
        return generoRepository.findAll();
    }

    public Optional<Genero> findById(Long id) {
        return generoRepository.findById(id);
    }

    @Override
    public Genero save(Genero genero) {
        return generoRepository.save(genero);
    }

    @Override
    public void deleteById(Long id) {
        generoRepository.deleteById(id);
    }


}
