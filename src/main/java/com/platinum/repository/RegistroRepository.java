package com.platinum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.platinum.model.Registro;

public interface RegistroRepository extends JpaRepository<Registro, Long> {
    // Puedes agregar consultas personalizadas aquí si es necesario
}
