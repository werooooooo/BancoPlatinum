package com.platinum.service;

import com.platinum.model.Ejecutivo;
import com.platinum.model.Persona;
import com.platinum.model.Usuario;

public interface RegistroService {
    void registrarUsuario(Usuario usuario, Persona persona, Ejecutivo ejecutivo);
    // Puedes agregar m�s m�todos seg�n sea necesario
}
