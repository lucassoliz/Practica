
package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void crearUsuario(Usuario usu){
        controlPersis.crearUsuario(usu);
    }
    
    public List<Usuario> traerUsuarios(){
        return controlPersis.traerUsuarios();
    }

    public void borrarUsuario(int id_eliminar) {
        
        controlPersis.borrarUsuario(id_eliminar);

    }

    public Usuario traerUsuarios(int id_editar) {
        
        return controlPersis.traerUsuarios(id_editar);

    }

    public void editarUsuario(Usuario usu) {
        
        controlPersis.editarUsuario(usu);
    }
    
}
