
package Practica1_Pokemon;

public class Charmander extends Pokemon implements IFuego{

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Charmander y este es mi ataque placaje");
 
    }

    public Charmander() {
    }

   
    
    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy charmander y este es mi ataque arraniazo");

    }

    @Override
    protected void atacarMordicos() {
        System.out.println("Hola soy charmander y este es mi ataque mordisco");

    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Hola soy charmander y este es mi ataque punio fuego");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Hola soy charmander y este es mi ataque lanzallamas");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Hola soy charmander y este es mi ataque ascuas");
    }
    
}
