package com.platinum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Transaccion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Id(pk auto incremental)
    
    @ManyToOne
    private Persona rutCliente; // RutCliente(fk)
    
    @ManyToOne
    private Persona rutDueno; // RutDueño(fk)
    
    @ManyToOne
    private CtaCorriente idCuenta; // IdCuenta(fk)
    
    private double montoTransferencia;
    private String cuentaTransferencia;
    private String tipoCuenta;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Persona getRutCliente() {
		return rutCliente;
	}
	public void setRutCliente(Persona rutCliente) {
		this.rutCliente = rutCliente;
	}
	public Persona getRutDueno() {
		return rutDueno;
	}
	public void setRutDueno(Persona rutDueno) {
		this.rutDueno = rutDueno;
	}
	public CtaCorriente getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(CtaCorriente idCuenta) {
		this.idCuenta = idCuenta;
	}
	public double getMontoTransferencia() {
		return montoTransferencia;
	}
	public void setMontoTransferencia(double montoTransferencia) {
		this.montoTransferencia = montoTransferencia;
	}
	public String getCuentaTransferencia() {
		return cuentaTransferencia;
	}
	public void setCuentaTransferencia(String cuentaTransferencia) {
		this.cuentaTransferencia = cuentaTransferencia;
	}
	public String getTipoCuenta() {
		return tipoCuenta;
	}
	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

    // Getters y Setters
    
}
