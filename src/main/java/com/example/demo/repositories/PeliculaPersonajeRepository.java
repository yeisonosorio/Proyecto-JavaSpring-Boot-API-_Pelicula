package com.example.demo.repositories;
import com.example.demo.models.PeliculaPersonaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaPersonajeRepository extends JpaRepository<PeliculaPersonaje, Long> {
}
