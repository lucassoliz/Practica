
package Practica1_Pokemon;
public class Squirtle extends Pokemon implements IAgua {

    public Squirtle() {//Constructor vacio porque no nos interesa jugar con los parametros
    }

    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Squirtel y este es mi ataque placaje");

    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Squirtle y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordicos() {
        System.out.println("Hola soy squirtle y este es mi ataque mordisco");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println("Hola soy Squirtle y este es mi ataque hidrobomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Hola soy Squirtle y este es mi ataque burbuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Hola soy Squirtle y este es mi ataque de pistola de agua");
    }
    
}
