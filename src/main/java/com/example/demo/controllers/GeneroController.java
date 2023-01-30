package com.example.demo.controllers;

import com.example.demo.models.Genero;
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

    @PostMapping
    public ResponseEntity<Genero> save(@RequestBody Genero genero) {
        return ResponseEntity.ok(generoService.save(genero));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Genero> findById(@PathVariable Long id) {
        return generoService.findById(id)
                .map(genero -> ResponseEntity.ok(genero))
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        generoService.deleteById(id);
        return ResponseEntity.noContent().build();

    }


    @GetMapping("/generos")
    public ResponseEntity<List<Genero>> findAll() {
        List<Genero> generos = generoService.findAll();
        return new ResponseEntity<>(generos, HttpStatus.OK);
    }


}


