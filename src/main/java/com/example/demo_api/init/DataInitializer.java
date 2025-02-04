package com.example.demo_api.init;

import com.example.demo_api.model.Desarrollador;
import com.example.demo_api.model.Videojuego;
import com.example.demo_api.repository.DesarrolladorRepositorio;
import com.example.demo_api.repository.VideojuegoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DataInitializer implements CommandLineRunner {


    @Autowired
    private DesarrolladorRepositorio desarrolladorRepositorio;
    @Autowired
    private VideojuegoRepositorio videojuegoRepositorio;


    @Override
    public void run(String... args) throws Exception {
        Desarrollador desarrollador = new Desarrollador();
        desarrollador.setNombre("FromSoftware");

        //Videojuego1
        Videojuego videojuego = new Videojuego();
        videojuego.setTitulo("Elden Ring");
        videojuego.setGenero("Sould");
        desarrollador.addVidejuego(videojuego);

        //Videojuego2
        Videojuego videojuego2 = new Videojuego();
        videojuego2.setTitulo("Minecraft");
        videojuego2.setGenero("Creacion-Fantasía");
        desarrollador.addVidejuego(videojuego2);

        //Videojuego3
        Videojuego videojuego3 = new Videojuego();
        videojuego3.setTitulo("Batman Arkham Nigth");
        videojuego2.setGenero("Lucha");
        desarrollador.addVidejuego(videojuego3);

        desarrolladorRepositorio.save(desarrollador);

        ArrayList<Videojuego> videojuegosQueEmpiezanPor =  videojuegoRepositorio.findByTituloStartingWith("B");
        for (Videojuego game : videojuegosQueEmpiezanPor) {
            System.out.println(game.getTitulo());
        }
    }
}
