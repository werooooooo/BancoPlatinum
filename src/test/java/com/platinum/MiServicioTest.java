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
        // Prueba de conexión a la base de datos
        assertNotNull(miServicio); // Aseguramos que el servicio se ha inyectado correctamente
    }

    @Test
    public void testObtenerInformacionEjecutivoPorRut() {
        // Datos de prueba
        String rutEjecutivo = "123456789"; // Reemplaza con un rut válido existente en tu base de datos
        String nombreEsperado = "NombreEjecutivo";
        String apellidoEsperado = "ApellidoEjecutivo";
        String direccionEsperada = "DireccionEjecutivo";
        String correoEsperado = "correo@ejecutivo.com";
        String telefonoEsperado = "123456789";
        String nombreMascotaEsperado = "MascotaEjecutivo";

        // Llamada al método del servicio
        Ejecutivo ejecutivo = miServicio.obtenerInformacionEjecutivoPorRut(rutEjecutivo);

        // Verificación de los resultados esperados
        assertEquals(nombreEsperado, ejecutivo.getNombre());
        assertEquals(apellidoEsperado, ejecutivo.getApellido());
        assertEquals(direccionEsperada, ejecutivo.getDireccion());
        assertEquals(correoEsperado, ejecutivo.getCorreo());
        assertEquals(telefonoEsperado, ejecutivo.getTelefono());
        assertEquals(nombreMascotaEsperado, ejecutivo.getNombreMascota());
    }
}

