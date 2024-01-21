package com.platinum.controller;

import com.platinum.model.Transaccion;
import com.platinum.model.TransferenciaRequest;

import com.platinum.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transferencia")
public class TransferenciaController {

    @Autowired
    private TransferenciaService transferenciaService;

    @PostMapping("/realizar")
    public String realizarTransferencia(@RequestBody TransferenciaRequest request) {
        // Aquí deberías manejar la lógica de realización de transferencia
        Transaccion transaccion = request.getTransaccion();
        transferenciaService.realizarTransferencia(transaccion);
        return "Transferencia realizada exitosamente";
    }

    // Puedes agregar más endpoints según sea necesario
}
