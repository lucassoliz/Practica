
package com.mycompany.jpaprueba.logica;

import com.mycompany.jpaprueba.persistence.ControladoraPersistencia;
import java.util.ArrayList;

 /*
va a contener todos los métodos necesarios que se utilizarán 
para llamar a la persistencia y, en consecuencia, 
interactuar con la base de datos. 
Por ejemplo, si se quiere crear un método create, 
se tendrá en esta controladora y se encargará de llamar 
al método create en la controladora de persistencia */
public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    //No le vamos a pasar todo el alumno, directamente le pasamos el id
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    //Va a devolver un tipo Alumno
    public Alumno traerAlumno(int id){
        
        return controlPersis.traerAlumno(id);
        
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
//---------------CARRERA--------------
    public void crearCarrea(Carrera carre){
        controlPersis.crearCarrea(carre);
    }
    
    //No le vamos a pasar todo el alumno, directamente le pasamos el id
    public void eliminarCarrera(int id){
        controlPersis.eliminarCarrera(id);
    
    }
    
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    public Carrera traerACarrera(int id){
        return controlPersis.traerCarrera(id);
        
    }
    
    public ArrayList<Carrera> traerListaCarrera(){
        return controlPersis.traerListaCarrera();
    }    
  
    
    
}
