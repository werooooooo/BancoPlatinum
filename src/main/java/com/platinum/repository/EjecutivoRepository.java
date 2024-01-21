package com.platinum.repository;

import com.platinum.model.Ejecutivo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EjecutivoRepository extends JpaRepository<Ejecutivo, Long> {
    Ejecutivo findByRutEjecutivoAndContraseña(String rutEjecutivo, String contraseña);
}
