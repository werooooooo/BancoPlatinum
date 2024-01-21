package com.platinum.controller;

import com.platinum.model.Ejecutivo;
import com.platinum.model.Persona;
import com.platinum.model.Usuario;
import com.platinum.service.RegistroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registro")
public class RegistroController {

    @Autowired
    private RegistroService registroService;

    @PostMapping("/usuario")
    public String registrarUsuario(@RequestBody RegistroUsuarioRequest request) {
        // Aqu� deber�as manejar la l�gica de registro de usuario
        Usuario usuario = request.getUsuario();
        Persona persona = request.getPersona();
        Ejecutivo ejecutivo = request.getEjecutivo();
        registroService.registrarUsuario(usuario, persona, ejecutivo);
        return "Usuario registrado exitosamente";
    }

    // Puedes agregar m�s endpoints seg�n sea necesario
}
