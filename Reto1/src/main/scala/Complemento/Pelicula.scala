package Complemento


class Pelicula {

    /*Atributos*/

    private var _nombre : String = _
    private var _generos : List[String] = _
    private var _duracion : Double = _
    private var _precio : Double = _
    private var _vistas : Int = _
    private var _descargas : Int = _

    def this(nuevo_nombre : String, nuevos_generos : List[String], nueva_duracion : Double, nuevo_precio : Double) {
       
        this()
        _nombre = nuevo_nombre
        _generos = nuevos_generos
        _duracion =  nueva_duracion
        _precio = nuevo_precio
        _vistas = 0
        _descargas = 0
    }

    def getNombre() : String = _nombre
    def getGeneros() : List[String] = _generos
    def getDuracion() : Double = _duracion
    def getPrecio() : Double = _precio
    def getVistas() : Int = _vistas

    
    def aumentarVistas() : Unit = _vistas = _vistas + 1


}