package Usuarios

import Complemento._
import Planes._

class Usuario {
    

    protected var _nombre :  String = _
    protected var _correo :  String = _
    protected var _contrasena : String = _
    

    /* Getters */

    def getNombre() : String = _nombre
    def getCorreo() : String = _correo
    def getContrasena() : String = _contrasena
    
    

}
