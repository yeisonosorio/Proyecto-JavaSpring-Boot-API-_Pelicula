package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

//genero muchas peliculas
@Data
@Entity
@Table(name = "genero")
@AllArgsConstructor
@NoArgsConstructor

public class Genero {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String imagen;


    @OneToMany(mappedBy = "genero")
    private List<Pelicula> peliculas;




}
