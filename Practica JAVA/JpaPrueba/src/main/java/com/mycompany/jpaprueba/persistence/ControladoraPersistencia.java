package com.mycompany.jpaprueba.persistence;

import com.mycompany.jpaprueba.logica.Alumno;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        
        aluJpa.create(alu);
        
    }
    
    
    
}
