
package com.mycompany.primerservlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import logica.Usuario;


@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //vamos a usar el modelo de capas asi que no vamos a usar nada de aca
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Por el momento practicamos de manera logica, es decir, el programa solo sabe lo que él conoce
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("123","Lucas","Siles", "4444444"));
        listaUsuarios.add(new Usuario("75433","pancho","tttt", "33333"));
        listaUsuarios.add(new Usuario("33","jose","martinez", "435353"));
        
        //clase especial que toma la sesion de usuarios de este momento
        HttpSession misesion = request.getSession(); //de la request, traeme su session
        misesion.setAttribute("listaUsuarios", listaUsuarios); //traemos lo que instanciamos
        
        response.sendRedirect("mostrarUsuarios.jsp"); //reenviame lo que te voy a mostrar a continuacion
        

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //declaramos nuestros atributos del index adentro de los parentesis
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        //test para verificar si llevo correctamente
        /*System.out.println("Dni es:" + dni);
        System.out.println("Nombre es:" + nombre);
        System.out.println("Apellido es:" + apellido);
        System.out.println("Telefono es:" + telefono);*/
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
