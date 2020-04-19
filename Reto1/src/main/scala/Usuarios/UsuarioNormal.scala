package Usuarios

import Complemento._
import Planes._

class UsuarioNormal extends Usuario {

    private var _mora : Boolean = _
    private var _plan : Plan = _
    private var _peliculas_descargadas : List[Pelicula] = List()
    var _estado : Boolean = _

    def this(nuevo_correo : String, nueva_contrasena : String, nuevo_nombre : String, nuevo_plan : Plan) {   
       
        this()
        _nombre = nuevo_nombre
        _correo  = nuevo_correo
        _contrasena = nueva_contrasena
        _mora = false
        _plan = nuevo_plan
        _estado = true
    }
    
    def pagarFactura() : Unit = {

    }

    def comprarPlan() : Unit = {
        
    }
}