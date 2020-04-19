package Netflix

import Usuarios._
import Complemento._

object Netflix {
    
    
    /* Atributos */

    var _peliculas : List[Pelicula] = List()
    var _usuarios_normales : List[UsuarioNormal] = List()
    var _usuarios_admin : List[UsuarioAdmin] = List()
    var _registros : List[Registro] = List()
    var _planes : List[Plan] = List()
    
    
    def registroUsuario(nuevo_usuario : UsuarioNormal ) : Unit = {

        _usuarios_normales = nuevo_usuario :: _usuarios_normales
    }

    def crearUsuarioAdmin(nuevo_usuario_admin : UsuarioAdmin ) : Unit = {

        _usuarios_admin = nuevo_usuario_admin :: _usuarios_admin 
    }

    def logeoAdmin(correo : String, contrasena : String ) : UsuarioAdmin = {

        for ( user <- _usuarios_admin) {

            if (user.getNombre() == correo && user.getContrasena() == contrasena ) {
                return user
            }
        }

        return null
    }

    def logeoUsuario(correo : String, contrasena : String ) : UsuarioNormal = {

        for ( user <- _usuarios_normales) {

            if (user.getNombre() == correo && user.getContrasena() == contrasena ) {
                return user
            }
        }

        return null
    }

    def buscarUsuario(nombre : String ) : Boolean = {


        for (n <- _usuarios_normales) {
            
            if (n.getNombre() == nombre)
                return true
        } 

        for (n <- _usuarios_admin) {
            
            if (n.getNombre() == nombre)
                return true
        } 

        return false
    }

    def buscarPelicua(nombre_pelicula : String ) : Pelicula = {

        for (pelicula <- _peliculas) {
            
            if (pelicula.getNombre() == nombre_pelicula) {

                return pelicula
            }
        }

        return null
    }
}
