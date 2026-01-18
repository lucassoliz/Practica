
package com.mycompany.primerservlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import logica.Controladora;
import logica.Usuario;


@WebServlet(name = "SvEditar", urlPatterns = {"/SvEditar"})
public class SvEditar extends HttpServlet {
    Controladora control = new Controladora();


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id_editar = Integer.parseInt(request.getParameter("id_usuarioEdit"));
        Usuario usu =  control.traerUsuarios(id_editar);
        //dicho usuario que traemos lo debemos guardar como como una variable de sesión
        //Porque si no, no vamos a tener este mismno usuario cuando estemos en JSP
        HttpSession misesion = request.getSession(); 
        misesion.setAttribute("usuEditar", usu); 
        
        
        response.sendRedirect("editar.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String dni = request.getParameter("dni");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String telefono = request.getParameter("telefono");
        
        Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar");
        usu.setDni(dni);
        usu.setApellido(apellido);
        usu.setNombre(nombre);
        usu.setTelefono(telefono);
            
        control.editarUsuario(usu);
        response.sendRedirect("index.jsp");
        
        
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
