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
       
        String nombreUsuario = autenticacionRequest.getNombreUsuario();
        String password = autenticacionRequest.getPassword();

        
        return "Inicio de sesión exitoso para el usuario: " + nombreUsuario;
    }

    
}
