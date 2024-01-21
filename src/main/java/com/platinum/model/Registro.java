package com.platinum.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Registro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Agrega aquí los atributos que correspondan a tu entidad

    // Constructor, getters y setters

    // Puedes agregar otros métodos y anotaciones según sea necesario
}
