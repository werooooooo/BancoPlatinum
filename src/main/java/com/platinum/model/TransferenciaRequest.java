package com.platinum.model;

public class TransferenciaRequest {

    private Transaccion transaccion;

    // Puedes agregar m�s campos seg�n sea necesario

    // Constructor(s) si es necesario
    public TransferenciaRequest() {
        // Constructor vac�o
    }
    public TransferenciaRequest(Transaccion transaccion) {
        this.transaccion = transaccion;
        // Puedes inicializar m�s campos si es necesario
    }
    
    // Getters y Setters

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }
}
