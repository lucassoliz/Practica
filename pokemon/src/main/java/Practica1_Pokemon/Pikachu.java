package Practica1_Pokemon;

public class Pikachu extends Pokemon implements IElectrico{

    public Pikachu() {
    }

  
    
    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy Pikachu y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy Pikachu y este es mi ataque araniazo");
    }

    @Override
    protected void atacarMordicos() {
        System.out.println("Hola soy Pikachu y este es mi ataque mordisco");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println("Hola soy Bulbasur y este es mi ataque impactaTRUENO");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Hola soy Bulbasur y este es mi ataque punio de Trueno");
    }
    
}
