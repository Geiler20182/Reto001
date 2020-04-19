package Usuarios

import Netflix._
import Complemento._
import util.control.Breaks._

class UsuarioAdmin extends Usuario {

    
    def this(nuevo_correo : String, nueva_contrasena : String, nuevo_nombre : String) {   
       
        this()
        _nombre = nuevo_nombre
        _correo  = nuevo_correo
        _contrasena = nueva_contrasena
    }

    def agregarPelicula(nueva_pelicula : Pelicula ) : Unit = {

        Netflix._peliculas = nueva_pelicula :: Netflix._peliculas
    }

    def eliminarPelicula(nombre_pelicula : String ) : Unit = {

        var pelicula_temp : List[Pelicula] = List()

        for (pelicula <- Netflix._peliculas ) {

            if (pelicula.getNombre() != nombre_pelicula) {

                pelicula_temp = pelicula :: pelicula_temp
            }
        }

        Netflix._peliculas = pelicula_temp 
    } 

    def eliminarUsuario(nombre_usuario :  String ) : Unit = {
        
        var usuario_temp : List[UsuarioNormal] =  List()

        for (usuario <- Netflix._usuarios_normales) {

            if (usuario.getNombre() !=  nombre_usuario) {
                
                usuario_temp = usuario :: usuario_temp
            }
        }

        Netflix._usuarios_normales = usuario_temp        
    }

    def inhabilitarUsuario(nombre_usuario :  String ) : Unit = {

        breakable {

            for (usuario <- Netflix._usuarios_normales ) {

                if (usuario.getNombre() ==  nombre_usuario) {
                    usuario._estado = true   
                    break
                }
            }

        }
    }

    def peliculasMasVistas() : List[Pelicula] = {

        
    }

    def peliculasMenosVistas() : List[Pelicula] = {

    } 

    def crearUsuarioAdmin(Usuario nuevo_usuario_admin ) {

    }
*/

}