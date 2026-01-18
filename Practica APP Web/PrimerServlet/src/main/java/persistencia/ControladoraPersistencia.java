
package persistencia;

import java.util.List;
import logica.Usuario;

public class ControladoraPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    //OPERACION CREATE
    public void crearUsuario(Usuario usu){
        
        usuJpa.create(usu);
    }
    
    //OPERACION READ
    public List<Usuario> traerUsuarios(){
        return usuJpa.findUsuarioEntities();
    }
}
