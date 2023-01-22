package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Optional;

//pelicula pertence a un genero


@Data
@Entity
@Table(name = "pelicula")
@AllArgsConstructor
@NoArgsConstructor
public class Pelicula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String caratula;
    private float calificacion;

    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "peliculaPersonaje",
            joinColumns = {@JoinColumn(name = "id_pelicula")},
            inverseJoinColumns = {@JoinColumn(name = "id_personaje")}
    )
    private List<Personaje> personajes;


}
