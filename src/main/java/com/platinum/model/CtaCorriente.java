package com.platinum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class CtaCorriente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCuenta; 
    
    @ManyToOne
    private Persona rutCliente; 
    
    private double monto;
    
    @ManyToOne
    private Ejecutivo ejecutivo;

	public Long getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(Long idCuenta) {
		this.idCuenta = idCuenta;
	}

	public Persona getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(Persona rutCliente) {
		this.rutCliente = rutCliente;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Ejecutivo getEjecutivo() {
		return ejecutivo;
	}

	public void setEjecutivo(Ejecutivo ejecutivo) {
		this.ejecutivo = ejecutivo;
	}  
    
}
