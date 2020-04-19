package Test

import Usuarios._
import Netflix._
import Complemento._

object HelloWorld {

    def main(args: Array[String]) : Unit = {

        var nuevo_plan : Plan = new Plan
        //var nuevo_usuario : UsuarioNormal = new UsuarioNormal("Geiler@org", "%$#", "Geiler", nuevo_plan )
        var nuevo_usuario : UsuarioAdmin = new UsuarioAdmin("Geiler@org", "%$#", "Geiler")


    }   
}