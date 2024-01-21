package com.platinum.controller;

import com.platinum.model.Usuario;
import com.platinum.model.Persona;
import com.platinum.model.Ejecutivo;

public class RegistroUsuarioRequest {
    private String nombre;
    private String apellido;
    private String direccion;
    private String correo;
    private String telefono;
    private String nombreMascota;
    private Usuario usuario;
    private Ejecutivo ejecutivo;
    
    
    public Persona getPersona() {
        
        Persona persona = new Persona();
        persona.setNombre(nombre);
        persona.setApellido(apellido);
        persona.setDireccion(direccion);
        persona.setCorreo(correo);
        persona.setTelefono(telefono);
        persona.setNombreMascota(nombreMascota);     

        return persona;
    }
    
    public Ejecutivo getEjecutivo() {     
        Ejecutivo ejecutivo = new Ejecutivo();
        ejecutivo.setNombre(nombre);
        ejecutivo.setApellido(apellido);
        ejecutivo.setDireccion(direccion);
        ejecutivo.setCorreo(correo);
        ejecutivo.setTelefono(telefono);
        ejecutivo.setNombreMascota(nombreMascota);       

        return ejecutivo;
    }
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
}
