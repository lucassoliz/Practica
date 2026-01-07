
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.ArrayList;
import java.util.Date;
//import com.mycompany.jpaprueba.persistence.ControladoraPersistencia;

public class JpaPrueba {

    public static void main(String[] args) {
       // ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        Controladora control = new Controladora();
       //todo esto es experimentar en el main, solo para probar 
       
       
       //Creacion Carrera
      // Carrera carre = new Carrera(6,"Civil");
       
       //Guardado Carrera en BD
       //control.crearCarrea(carre);
       
       //Creacion Alumno (con carrera)
       //Alumno al = new Alumno(23, "Generico", "Test",new Date(),carre);
  
       //Guardamos el alumno en la BD
      //control.crearAlumno(al);
       
      //al.setCarre(carre);
              
       //vemos el resultadp
        System.out.println("----------------");
        System.out.println("---DATOS ALUMNO-----");
        Alumno alu = control.traerAlumno(23);
        System.out.println("Alumno: " + alu.getNombre()
             + " " + alu.getApellido());
        System.out.println("Cursa la carrera de: " + alu.getCarre().getNombre());
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       
       /*      control.crearAlumno(al2);
       
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
        */
    }
}
