package com.platinum.service.impl;

import com.platinum.model.Ejecutivo;
import com.platinum.model.Persona;
import com.platinum.model.Usuario;
import com.platinum.repository.EjecutivoRepository;
import com.platinum.repository.PersonaRepository;
import com.platinum.repository.UsuarioRepository;
import com.platinum.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroServiceImpl implements RegistroService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private PersonaRepository personaRepository;

    @Autowired
    private EjecutivoRepository ejecutivoRepository;

    @Override
    public void registrarUsuario(Usuario usuario, Persona persona, Ejecutivo ejecutivo) {
        // L�gica para registrar un nuevo usuario, persona y asignar un ejecutivo
        // Puedes implementar la l�gica de asignaci�n de ejecutivo seg�n tus necesidades
        // Ejemplo:
        usuarioRepository.save(usuario);
        personaRepository.save(persona);
        ejecutivoRepository.save(ejecutivo);
    }
    // Puedes agregar m�s l�gica seg�n sea necesario
}
