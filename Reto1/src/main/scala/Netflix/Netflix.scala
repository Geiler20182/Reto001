package Netflix

import Usuarios._
import Complemento._
import Planes._

import util.control.Breaks._

class Netflix {
    
    
    /* Atributos */

    private var _peliculas : List[Pelicula] = List()
    private var _usuarios_normales : List[UsuarioNormal] = List()
    private var _usuarios_admin : List[UsuarioAdmin] = List()
    private var _facturas : List[Factura] = List()

    //private var _registros : List[Registro] = List()
    //private var _planes : List[Plan] = List()

    def getPeliculas() : List[Pelicula] = _peliculas
    def getUsuariosNormales() : List[UsuarioNormal] = _usuarios_normales
    def getUsuariosAdministradores() : List[UsuarioAdmin] = _usuarios_admin
    def getFacturas() : List[Factura] = _facturas

    def setPeliculas(nuevo_catalogo : List[Pelicula] ) : Unit = _peliculas = nuevo_catalogo
    def setUsuariosNormales(nuevo_catalogo : List[UsuarioNormal] ) : Unit = _usuarios_normales = nuevo_catalogo
    def setUsuariosAdministradores(nuevo_catalogo : List[UsuarioAdmin] ) : Unit = _usuarios_admin = nuevo_catalogo
    

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

    def solicitudDescarga(nombre_pelicula : String, id_emisor : String ) : Unit = {

        var es_admin : Boolean = false 
        var pos_emisor : Int = 0
        var iter : Int = 0

        breakable {

            for (admin <- _usuarios_admin) {

                if (admin.getIdUsuario() == id_emisor) {
                    es_admin = true
                    pos_emisor = iter
                }
                iter = iter + 1
            }
        }

        if (es_admin == true ) {

            var pelicula : Pelicula = new Pelicula
        }

        else {
            
        }
        
    }

    def agregarPelicula(nueva_pelicula : Pelicula) : Unit = {

        _peliculas = nueva_pelicula :: _peliculas
    } 

    

}
