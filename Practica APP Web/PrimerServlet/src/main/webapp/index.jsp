

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario de Prueba</title>
    </head>
    <body>
        <h1>Datos del usuario</h1>
        <form action="SvUsuarios" method="POST">
            <p><label>Dni:</label><input type="text" name="dni"></p>
            <p><label>Nombre:</label><input type="text" name="nombre"></p>
            <p><label>Apellido:</label><input type="text" name="apellido"></p>
            <p><label>Telefono:</label><input type="text" name="telefono"></p>
            <button type="submit" > Enviar </button>
        </form>
        <%-- Vamos a crear otro form para los GET--%>
        
        <h1>Ver lista de usuarios</h1>
        <p>Para ver los datos de los usuarios cargados haga click en el siguiente boton</p>
        <form action="SvUsuarios" method="GET">
            <button type="submit"> Mostrar Usuarios</button>
            
        </form>
        
        <h1>Eliminar usuario</h1>
        <p>Ingrese el ID del usuario que desea eliminar</p>
        <form action="SvEliminar" method="POST"> <%-- no usamos DELETE por el momento porque puede que entre en conflicto
            por el tema de las actualizaciones, usaremos POST como alternativa --> Tenemos que crear otro Servlet 
            ya que nuestro SvUsuario ya esta en uso su doGET y su doPOST, y si incluimos a este tambien entrara en conflicto--%>
            <p><label>ID:</label><input type="text" name="id_usuario"></p>
            <button type="submit"> Eliminar Usuario</button>
            
        </form>
            
         <h1>Editar usuario</h1>
        <p>Ingrese el ID del usuario que deseas editar</p>
        <form action="SvEditar" method="GET">
            <p><label>ID:</label><input type="text" name="id_usuarioEdit"></p>
            <button type="submit"> Editar Usuario</button>
            
        </form>
        
    </body>
</html>
