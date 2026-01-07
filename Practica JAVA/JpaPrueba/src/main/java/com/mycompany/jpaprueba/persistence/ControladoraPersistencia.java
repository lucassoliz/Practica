package com.mycompany.jpaprueba.persistence;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.persistence.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();

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
    
    
    
    
}
