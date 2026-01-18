
package persistencia;

import java.util.List;
import logica.Usuario;
import persistencia.exceptions.NonexistentEntityException;

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

    public void borrarUsuario(int id_eliminar) {
        
        try {
            usuJpa.destroy(id_eliminar);
        } catch (NonexistentEntityException ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }


    }

    public Usuario traerUsuarios(int id_editar) {
        
        return usuJpa.findUsuario(id_editar);
    }

    public void editarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            System.getLogger(ControladoraPersistencia.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }

    }
}
