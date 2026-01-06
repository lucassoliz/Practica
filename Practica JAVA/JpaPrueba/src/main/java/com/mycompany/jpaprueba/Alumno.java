package com.mycompany.jpaprueba;

import java.io.Serializable;
import java.util.Date;
// CAMBIO IMPORTANTE: de javax a jakarta
import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
 public class Alumno implements Serializable {
 /*Hasta con la ORM podemos decirle a nuestra BD
    Che creame este valor y este id generamelo de forma automatica
    cada vez que recibas un nuevp registro*/  
//Es importante la ubicacion de los dos @ deben ir juntos y arriba de mid PK
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO) //Sequence para que vaya como una secuencia; 1,2,3... y AUTO para que el mismo elija cual sea la mejor opcion
     private int id;
    @Basic   //Aunque no hace falta, JPA ya lo toma como Basic si no le ponemos nada
     private String nombre;
     private String apellido;
     
     @Temporal(TemporalType.DATE)
     private Date fechaNac;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido, Date fechaNac) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }
     
     
     
}
