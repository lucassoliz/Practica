
package Practica1_Pokemon;
public class Bulbasur extends Pokemon implements IPlanta{

    public Bulbasur() {
    }
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Bulbasur y este es mi ataque atacarAraniazo");
    }

    @Override
    protected void atacarMordicos() {
        System.out.println("Hola soy Bulbasur y este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy Bulbasur y este es mi ataque drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy Bulbasur y este es mi ataque paralizar");
    }
    
}
