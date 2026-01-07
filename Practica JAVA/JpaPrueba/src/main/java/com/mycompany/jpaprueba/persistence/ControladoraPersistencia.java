package com.mycompany.jpaprueba.persistence;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.persistence.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    CarreraJpaController carreJpa = new CarreraJpaController();
        
    public void crearAlumno(Alumno alu) {
        
        aluJpa.create(alu);
        
    }

    public void eliminarAlumno(int id) {
        try {
            aluJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            aluJpa.edit(alu);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
       return aluJpa.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        //Evitamos el Cast el casteo
        List<Alumno> listita = aluJpa.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList<Alumno> (listita);
        return listaAlumnos;
    }

    //---------CARRERA-------------------
    
    public void crearCarrea(Carrera carre) {
        carreJpa.create(carre);
        
    }

    public void eliminarCarrera(int id) {
        try {
            carreJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public void editarCarrera(Carrera carre) {
        try {
            carreJpa.edit(carre);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreJpa.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarrera() {
        //Evitamos el Cast el casteo
        List<Carrera> lista = carreJpa.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList<Carrera> (lista);
        return listaCarreras;
    }
    
    
    
    
}
