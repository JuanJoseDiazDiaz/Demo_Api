package com.example.demo_api.controller;

import com.example.demo_api.model.Videojuego;
import com.example.demo_api.repository.VideojuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/videojuegos")
public class VideojuegoController {

    @Autowired
    private VideojuegoRepositorio repositorio;

    @GetMapping("/findAll")
    public List<Videojuego> allVideojuegos() {
        return repositorio.findAll();
    }
    @GetMapping("/{id}")
    public Videojuego getVideoGameById(@PathVariable Long id) {
        return repositorio.getById(id);
    }
}
