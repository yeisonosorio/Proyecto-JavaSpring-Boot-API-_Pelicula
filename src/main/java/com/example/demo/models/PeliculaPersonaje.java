package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
@Table(name = "peliculaPersonaje")
@AllArgsConstructor
@NoArgsConstructor

public class PeliculaPersonaje {
    @EmbeddedId
    private PeliculaPersonajeId id;

}

@Embeddable
class PeliculaPersonajeId implements Serializable {

    private long id_Pelicula;
    private long id_Personaje;

}