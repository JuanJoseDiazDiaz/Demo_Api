package com.example.demo_api.main;

import com.example.demo_api.repository.VideojuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Main implements CommandLineRunner {
    @Autowired
    VideojuegoRepositorio videojuegoRepositorio;
    @Override
    public void run(String... args) throws Exception {
//        System.out.println(videojuegoRepositorio.findByTituloStartingWith("M").getTitulo());
    }
}
