package com.platinum;

import org.springframework.stereotype.Service;
import com.platinum.model.Ejecutivo;

@Service
public class MiServicio {
	public Ejecutivo obtenerInformacionEjecutivoPorRut(String rut) {
        	
		
		Ejecutivo ejecutivo = obtenerEjecutivoPorRut(rut);
		
		if (ejecutivo == null) {
		}

        return ejecutivo;
    }

   
    private Ejecutivo obtenerEjecutivoPorRut(String rut) {
        
        return null; 
    }
}