
package Practica1_Pokemon;

public abstract class Pokemon { //lo que tiene en comun los demas pokemones
    protected int numPokedex; //Protected para que solo las hijas puedan acceder
    protected String nombre;
    protected double peso;
    protected String sexo;
    protected int temporada;
   
    protected abstract void atacarPlacaje(); //Como es de una clase abstract sus metodos tambien lo son, y claro void porque no devuelve nada
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordicos();

    /*  Interfaces: QUE HACE
    abstract: QUE ES, me interesa las caracteristicas */    
}
