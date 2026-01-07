
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;
//import com.mycompany.jpaprueba.persistence.ControladoraPersistencia;

public class JpaPrueba {

    public static void main(String[] args) {
       // ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        Controladora control = new Controladora();
       //todo esto es experimentar en el main, solo para probar 
       Alumno al2 = new Alumno(66, "Generico", "Test",new Date());
        control.crearAlumno(al2);
       
       //control.eliminarAlumno(30);
       
       //alu.setApellido("Soliz");
       //control.editarAlumno(alu);
       
       Alumno alu = control.traerAlumno(20);
        System.out.println("-------BUSQUEDA INDIVIDUAL---------");
        System.out.println("El alumno es:" + alu.toString());
       
        System.out.println("---------BUSQUEDA DE TODOS---------");
        ArrayList<Alumno> listaAlumnos = control.traerListaAlumnos();
        for(Alumno al : listaAlumnos){
            System.out.println("El alumno es: " + al.toString());
        }
        
    }
}
