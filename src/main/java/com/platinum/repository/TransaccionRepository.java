package com.platinum.repository;

import com.platinum.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository<Transaccion, Long> {
    // Puedes agregar consultas específicas si es necesario
}
