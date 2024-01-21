package com.platinum.service;

import com.platinum.model.Ejecutivo;
import com.platinum.model.Persona;
import com.platinum.model.Usuario;

public interface RegistroService {
    void registrarUsuario(Usuario usuario, Persona persona, Ejecutivo ejecutivo);
    // Puedes agregar más métodos según sea necesario
}
