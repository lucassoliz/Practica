
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
import logica.Controladora;
import logica.Usuario;


@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    Controladora control = new Controladora(); //Global para que lo use tambien el metodo POST y GET

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //vamos a usar el modelo de capas asi que no vamos a usar nada de aca
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //Por el momento practicamos de manera logica, es decir, el programa solo sabe lo que él conoce
        List<Usuario> listaUsuarios = new ArrayList<>();
        //Vamos a traer los usuarios de la BD en vez de crearlo manualmente como lo estabamos haciendo
        listaUsuarios = control.traerUsuarios();
        
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
        
        Usuario usu = new Usuario();
        usu.setDni(dni);
        usu.setApellido(apellido);
        usu.setNombre(nombre);
        usu.setTelefono(telefono);
            
        control.crearUsuario(usu);
        response.sendRedirect("index.jsp"); //para que lo redicione al darle enviar

    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
