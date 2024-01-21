package com.platinum.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.platinum.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // Puedes agregar consultas personalizadas si es necesario
}
