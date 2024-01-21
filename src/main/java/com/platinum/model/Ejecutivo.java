package com.platinum.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Ejecutivo {

    @Id
    private String rut;
    private String nombre;
    private String departamento;   
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private String nombreMascota;
 
    public Ejecutivo() {}

    public Ejecutivo(String rut, String nombre, String departamento) {
        this.rut = rut;
        this.nombre = nombre;
        this.departamento = departamento;
    }
    public String getRut() {
        return rut;
    }

    public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getNombreMascota() {
		return nombreMascota;
	}

	public void setNombreMascota(String nombreMascota) {
		this.nombreMascota = nombreMascota;
	}

	public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
