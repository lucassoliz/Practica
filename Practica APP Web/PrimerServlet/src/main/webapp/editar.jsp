
<%@page import="logica.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Usuario</title>
    </head>
    <body>
        <% Usuario usu = (Usuario) request.getSession().getAttribute("usuEditar"); //no lo podemos traer como objeto asi sin mas, hace falta castearlos ( ) %>
        <h1>Datos del usuario</h1>
        <form action="SvEditar" method="POST">
            <p><label>Dni:</label><input type="text" name="dni" value="<%=usu.getDni()%>"></p>
            <p><label>Nombre:</label><input type="text" name="nombre" value="<%=usu.getNombre()%>"></p>
            <p><label>Apellido:</label><input type="text" name="apellido" value="<%=usu.getApellido()%>"></p>
            <p><label>Telefono:</label><input type="text" name="telefono" value="<%=usu.getTelefono()%>"></p>
            <button type="submit" > Guardar </button>
        </form>
    </body>
</html>
