package com.platinum.service.impl;

import com.platinum.model.Ejecutivo;
import com.platinum.repository.EjecutivoRepository;
import com.platinum.service.EjecutivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EjecutivoServiceImpl implements EjecutivoService {

    @Autowired
    private EjecutivoRepository ejecutivoRepository;

    @Override
    public boolean autenticarEjecutivo(String rut, String password) {
        Ejecutivo ejecutivo = ejecutivoRepository.findByRutEjecutivoAndContrase�a(rut, password);
        return ejecutivo != null;
    }
    // Puedes agregar m�s l�gica seg�n sea necesario
}
