
package com.mycompany.plantaejercicio;

public class PlantaEjercicio {

    public static void main(String[] args) {
        
        Arbol arbolito = new Arbol(); //tengo dos tipos de constructor, si quiero con otros atributos o sin datp en particular
        Flor florcita = new Flor();
        Arbusto arbustito = new Arbusto();
        
        arbolito.decirLoqueSoy();
        florcita.decirLoqueSoy();
        arbustito.decirLoqueSoy();
    }
}
