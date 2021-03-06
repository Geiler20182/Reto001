package Complemento

import scala.util.Random

class Factura {


    private var _id_factura : Int = generarID()
    private var _id_cliente : String = _
    private var _nombre_cliente : String = _ 
    private var _fecha_expedicion : String = generarFechaExpedicion() 
    private var _fecha_vencimiento : String = generarFechaVencimiento()
    private var _subtotal : Double = _
    private var _total : Double = _
    private var _descripcion : List[String] = List()
    private var _cobro_adicional : Double = _



    def this(id_cliente : String, nombre_cliente : String, costo : Double, nueva_descripcion : String) {
        
        this()
        _id_cliente = id_cliente
        _nombre_cliente = nombre_cliente
        _subtotal = costo
        _total = costo 
        _cobro_adicional = 0
        _descripcion = nueva_descripcion :: _descripcion
    }
    
    def getIdCliente() : String = _id_cliente
    def getIdFactura() : Int = _id_factura
    def getFechaExpedicion() : String = _fecha_expedicion
    def getFechaVencimiento() : String = _fecha_vencimiento
    def getDescripcion() : List[String] = _descripcion
    def getSubtotal() : Double = _subtotal
    def getCobroAdicional() : Double = _cobro_adicional
    def getTotal() : Double = _total


    private def generarID() : Int = {

        var id = Random.nextInt(19872332) + 9999999

        return id 
    }
    
    private def generarFechaExpedicion() : String = {

        var fecha_exp : String = "" + java.time.LocalDate.now
        return fecha_exp
    }

    private def generarFechaVencimiento() : String = {

        var mes_string : String = _fecha_expedicion.charAt(5) + "" +  _fecha_expedicion.charAt(6) + ""
        var mes_int : Int = mes_string.toInt

        if (mes_int == 12) {
            mes_int = 1
        }

        else {
            mes_int = mes_int + 1
        }

        var fecha_t : String = ""

        if (mes_int > 9) {
            
            fecha_t = _fecha_expedicion.substring(0, 5) + mes_int + "" + _fecha_expedicion.substring(7, 10)
        }
        else {
            fecha_t = _fecha_expedicion.substring(0, 5) + "0" + mes_int + "" + _fecha_expedicion.substring(7, 10)
        }
       
        
        return fecha_t
    }

    private def calcularTotal(valor : Double) : Unit  = {
        _total = _total + valor
    }
    
    def nuevaDescripcion(nueva_descripcion : String ) : Unit = {

        _descripcion = nueva_descripcion :: _descripcion
    }   

    def agregarCostoAdicional(nuevo_cobro_adicional : Double) : Unit = {

        if (nuevo_cobro_adicional > 0.0) {
            _cobro_adicional = _cobro_adicional + nuevo_cobro_adicional
            calcularTotal(nuevo_cobro_adicional)
        }

    }



}