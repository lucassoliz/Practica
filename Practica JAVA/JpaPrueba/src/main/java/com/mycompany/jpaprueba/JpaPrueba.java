
package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.Date;
//import com.mycompany.jpaprueba.persistence.ControladoraPersistencia;

public class JpaPrueba {

    public static void main(String[] args) {
       // ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        Controladora control = new Controladora();
       //todo esto es experimentar en el main, solo para probar 
        Alumno alu = new Alumno(15, "Lucas", "Siles",new Date());
        
        control.crearAlumno(alu);
    }
}
