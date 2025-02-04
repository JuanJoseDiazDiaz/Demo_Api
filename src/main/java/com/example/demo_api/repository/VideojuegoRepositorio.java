package com.example.demo_api.repository;

import com.example.demo_api.model.Videojuego;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;

public interface VideojuegoRepositorio extends JpaRepository<Videojuego, Long> {
    public ArrayList<Videojuego> findByTituloStartingWith(String titulo);
}
