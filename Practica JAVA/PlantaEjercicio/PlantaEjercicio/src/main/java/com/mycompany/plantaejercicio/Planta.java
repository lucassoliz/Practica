package com.mycompany.plantaejercicio;

public abstract class Planta { //Lo podemos pensar como una clase abtracta con su metodo hola soy una ...
/*Esto garantiza que la clase funcione únicamente como un molde (template) 
    para las categorías específicas de plantas, prohibiendo la creación 
    de objetos genéricos y asegurando el polimorfismo mediante métodos 
    abstractos, al ser abstract nos inpide que alguien haga new Planta( ), haciendo que se creen objetos de categoria concretas    */
  
    private String nombre;
    private double altoTallo;
    private boolean tieneHojas;
    private String climaIdeal;
    
//CONSTRUCTOR esta pensado para sus hijas en si esta clase abstrac - - - - - - - -
//constructor vacio
    public Planta() {
    }
//constructor con sus respectivomos parametros 
    public Planta(String nombre, double altoTallo, boolean tieneHojas, String climaIdeal) {
        this.nombre = nombre;
        this.altoTallo = altoTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }
//GETTERS Y SETTERS - - - - - - - - - - - - - - --
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltoTallo() {
        return altoTallo;
    }

    public void setAltoTallo(double altoTallo) {
        this.altoTallo = altoTallo;
    }

    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public String getClimaIdeal() {
        return climaIdeal;
    }

    public void setClimaIdeal(String climaIdeal) {
        this.climaIdeal = climaIdeal;
    }
 // METODOS
    //Ojo no olvidar el tipo de dato, en este caso es void
    public abstract void decirLoqueSoy();
    
    
}
