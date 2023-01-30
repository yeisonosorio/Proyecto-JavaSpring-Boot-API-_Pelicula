package com.example.demo.services;
import com.example.demo.models.Personaje;
import com.example.demo.repositories.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class PersonajeServiceImpl implements PersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    public PersonajeServiceImpl(PersonajeRepository personajeRepository) {
        this.personajeRepository = personajeRepository;
    }

    @Override
    public List<Personaje> findAll() {
        return personajeRepository.findAll();
    }

    @Override
    public Optional<Personaje> findBy(Long id) {
        return personajeRepository.findById(id);
    }

    @Override
    public Personaje save(Personaje personaje) {
        return personajeRepository.save(personaje);
    }

    @Override
    public void deleteById(Long id) {
        personajeRepository.deleteById(id);
    }
}
