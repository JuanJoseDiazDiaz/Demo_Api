package com.example.demo_api.model;

import jakarta.persistence.*;

@Entity
public class Videojuego {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String genero;

    public Videojuego() {
    }
    public Long getId() {
        return id;
    }

    @ManyToOne
    @JoinColumn(name = "desarrollador_id")
    private Desarrollador desarrollador;

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Desarrollador getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(Desarrollador desarrollador) {
        this.desarrollador = desarrollador;
    }
}
