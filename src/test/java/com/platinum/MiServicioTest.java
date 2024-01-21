package com.platinum;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.platinum.model.Ejecutivo;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class MiServicioTest {

    @Autowired
    private MiServicio miServicio;

    @Test
    public void testConexionBaseDatos() {
       
        assertNotNull(miServicio); 
    }

    @Test
    public void testObtenerInformacionEjecutivoPorRut() {
        
        String rutEjecutivo = "123456789";
        String nombreEsperado = "NombreEjecutivo";
        String apellidoEsperado = "ApellidoEjecutivo";
        String direccionEsperada = "DireccionEjecutivo";
        String correoEsperado = "correo@ejecutivo.com";
        String telefonoEsperado = "123456789";
        String nombreMascotaEsperado = "MascotaEjecutivo";

        
        Ejecutivo ejecutivo = miServicio.obtenerInformacionEjecutivoPorRut(rutEjecutivo);

        
        assertEquals(nombreEsperado, ejecutivo.getNombre());
        assertEquals(apellidoEsperado, ejecutivo.getApellido());
        assertEquals(direccionEsperada, ejecutivo.getDireccion());
        assertEquals(correoEsperado, ejecutivo.getCorreo());
        assertEquals(telefonoEsperado, ejecutivo.getTelefono());
        assertEquals(nombreMascotaEsperado, ejecutivo.getNombreMascota());
    }
}

