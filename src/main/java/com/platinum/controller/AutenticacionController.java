package com.platinum.controller;

import com.platinum.model.AutenticacionRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autenticacion")
public class AutenticacionController {

    @PostMapping("/iniciar-sesion")
    public String iniciarSesion(@RequestBody AutenticacionRequest autenticacionRequest) {
        // Aqu� puedes implementar la l�gica de autenticaci�n
        String nombreUsuario = autenticacionRequest.getNombreUsuario();
        String password = autenticacionRequest.getPassword();

        // L�gica de autenticaci�n (puedes verificar las credenciales en la base de datos, por ejemplo)

        // Si las credenciales son v�lidas, puedes devolver un mensaje de �xito
        return "Inicio de sesi�n exitoso para el usuario: " + nombreUsuario;
    }

    // Puedes agregar m�s m�todos seg�n sea necesario
}
