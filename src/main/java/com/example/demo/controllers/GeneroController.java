package com.example.demo.controllers;

import com.example.demo.models.Genero;
import com.example.demo.services.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;



@RestController
@RequestMapping("/api")
public class GeneroController {

    @Autowired
    private GeneroService service;

    @GetMapping(value = "/genero")
    public List<Genero> listar() {
        return service.findAll();
    }

    @PostMapping(value = "/genero1")
    public void crear(@RequestBody Genero genero) {
         service.save(genero);

    }
}


