
package Practica1_Pokemon;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        
        //creacion de los objetos:
        
        Squirtle squirtle = new Squirtle();
        Charmander charman = new Charmander ();
        Bulbasur bulba = new Bulbasur();
        Pikachu pika = new Pikachu();
        
        squirtle.atacarAraniazo();
        squirtle.atacarMordicos();
        bulba.atacarPlacaje();
        bulba.atacarDrenaje();
        pika.atacarMordicos();
        pika.atacarPunioTrueno();
        charman.atacarAscuas();
        charman.atacarPunioFuego();
        
        
    }
}
