package com.platinum.model;

public class TransferenciaRequest {

    private Transaccion transaccion;    
   
    public TransferenciaRequest() {
      
    }
    public TransferenciaRequest(Transaccion transaccion) {
        this.transaccion = transaccion;
       
    }
  

    public Transaccion getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(Transaccion transaccion) {
        this.transaccion = transaccion;
    }
}
