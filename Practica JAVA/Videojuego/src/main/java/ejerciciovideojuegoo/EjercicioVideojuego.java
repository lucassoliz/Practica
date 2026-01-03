
package ejerciciovideojuegoo;

import ejercicioVideojuego.logica.VideoJuego;
import java.util.ArrayList;
import java.util.List;

public class EjercicioVideojuego {
    
    public static void main(String[] args){
        //Punto 2
        List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();
        
        VideoJuego video1 = new VideoJuego(123, "Banjo Kazooeie", "Nintendo 64", 4 , "Plataforma");
        VideoJuego video2 = new VideoJuego(433, "Fortnite", "Nintendo 64", 4 , "Plataforma");
        VideoJuego video3 = new VideoJuego(423, "silkSong", "PC", 1 , "Estrategia");
        VideoJuego video4 = new VideoJuego(101, "CS 1.6", "PC", 1 , "Shooter");
        VideoJuego video5 = new VideoJuego(643, "Mario Kart 64", "Nintendo 64", 2 , "Plataforma");
        
        listaVideojuegos.add(video1);
        listaVideojuegos.add(video2);
        listaVideojuegos.add(video3);
        listaVideojuegos.add(video4);
        listaVideojuegos.add(video5);
        
        //Punto 3
        for(VideoJuego video : listaVideojuegos){
            System.out.println("Titulo: " + video.getTitulo() + " Consola: " 
            + video.getConsola() + " Cant Jugadores: " + video.getCantJugadores());
        }
        
        //Punto 4 Cambio de nombre y jugadores
        video1.setTitulo("Mariano 128");
        video1.setCantJugadores(5);
        
        video5.setTitulo("CSS");
        video5.setCantJugadores(7);
        
        //Punto 5
        for(VideoJuego video : listaVideojuegos){
            if(video.getConsola().equals("Nintendo 64")){
                System.out.println( video.toString());
            }
        }        
        
    }
}
