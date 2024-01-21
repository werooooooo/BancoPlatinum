package com.platinum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.platinum.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}
