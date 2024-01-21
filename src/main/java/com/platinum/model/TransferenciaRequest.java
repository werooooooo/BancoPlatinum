package com.platinum.model;

public class TransferenciaRequest {

    private Transaccion transaccion;

    // Puedes agregar más campos según sea necesario

    // Constructor(s) si es necesario
    public TransferenciaRequest() {
        // Constructor vacío
    }
    public TransferenciaRequest(Transaccion transaccion) {
        this.transaccion = transaccion;
        // Puedes inicializar más campos si es necesario
    }
    
    // Getters y Setters

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }
}
