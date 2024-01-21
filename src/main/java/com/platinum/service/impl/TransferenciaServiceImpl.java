package com.platinum.service.impl;

import com.platinum.model.Transaccion;
import com.platinum.repository.TransaccionRepository;
import com.platinum.service.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransferenciaServiceImpl implements TransferenciaService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public void realizarTransferencia(Transaccion transaccion) {
        // L�gica para realizar la transferencia
        // Puedes implementar la l�gica seg�n tus necesidades
        transaccionRepository.save(transaccion);
    }
    // Puedes agregar m�s l�gica seg�n sea necesario
}
