package com.example.demo_api.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Desarrollador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @OneToMany(mappedBy = "desarrollador", cascade = CascadeType.ALL)
    private List<Videojuego> videojuegos;

    public Desarrollador() {
        videojuegos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Videojuego> getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(List<Videojuego> videojuegos) {
        this.videojuegos = videojuegos;
    }

    public void addVidejuego(Videojuego game){
        this.videojuegos.add(game);
        game.setDesarrollador(this);
    }

    public void removeVidejuego(Videojuego game){
        this.videojuegos.remove(game);
        game.setDesarrollador(null);
    }
}
