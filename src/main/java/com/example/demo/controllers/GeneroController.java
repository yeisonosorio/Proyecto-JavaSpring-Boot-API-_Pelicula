package com.example.demo.controllers;

import com.example.demo.models.Genero;
import com.example.demo.models.Pelicula;
import com.example.demo.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    private GeneroService generoService;

    public GeneroController(GeneroService generoservice) {
        this.generoService = generoservice;
    }

    /**
     * @GetMapping(value = "/listar")
     * public ResponseEntity<List<Genero>> findAll() {
     * return ResponseEntity.ok(generoService.findAll());
     * }
     **/

    /**
     * Guarda un Genero
     *
     * @param genero
     * @return
     */
    @PostMapping
    public ResponseEntity<Genero> save(@RequestBody Genero genero) {
        return ResponseEntity.ok(generoService.save(genero));
    }

    /**
     * Buscando un genero por Id
     *
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public ResponseEntity<Genero> findById(@PathVariable Long id) {
        return generoService.findById(id)
                .map(g -> ResponseEntity.ok(g))
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Elimina a un genero por Id
     *
     * @param id
     * @return
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        generoService.deleteById(id);
        return ResponseEntity.noContent().build();

    }

    /**
     * Listar todos los generos
     *
     * @return
     */
    @GetMapping("/generos")
    public ResponseEntity<List<Genero>> findAll() {
        List<Genero> generos = generoService.findAll();
        return new ResponseEntity<>(generos, HttpStatus.OK);
    }

    /**
     * Lista las peliculas
     */
    @GetMapping("/{id}/peliculas")
    public ResponseEntity<List<Pelicula>> findPeliculasByGenero(@PathVariable Long id) {
        return generoService.findById(id)
                .map(g -> ResponseEntity.ok(g.getPeliculas()))
                .orElse(ResponseEntity.notFound().build());
    }

}


