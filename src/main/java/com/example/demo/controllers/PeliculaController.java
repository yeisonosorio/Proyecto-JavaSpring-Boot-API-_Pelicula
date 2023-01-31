package com.example.demo.controllers;


import com.example.demo.models.Pelicula;
import com.example.demo.repositories.PeliculaRepository;
import com.example.demo.services.PeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pelicula")
public class PeliculaController {
    @Autowired
    private PeliculaService peliculaService;

    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    }

    /**
     * Guarda una pelicula
     *
     * @param pelicula
     * @return
     */
    @PostMapping
    public ResponseEntity<Pelicula> save(@RequestBody Pelicula pelicula) {
        return ResponseEntity.ok(peliculaService.save(pelicula));
    }




}
