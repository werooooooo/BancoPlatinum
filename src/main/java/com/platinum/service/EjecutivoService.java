package com.platinum.service;

import com.platinum.model.Ejecutivo;

public interface EjecutivoService {
    boolean autenticarEjecutivo(String rut, String password);
    // Puedes agregar más métodos según sea necesario
}
