package com.example.demo_api.repository;

import com.example.demo_api.model.Desarrollador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DesarrolladorRepositorio extends JpaRepository<Desarrollador, Long> {
}
