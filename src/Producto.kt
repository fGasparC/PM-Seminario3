class Producto {
    var nombre=""
    var precio=0f
    var cantidad=0

    init {
        creaProducto()
    }

    fun creaProducto() {
        println("Introduce el nombre del producto")
        nombre = readLine() ?: "null"
        println("Introduce el precio del producto")
        precio = readLine()!!.toFloat()
        println("Introduce el stock del producto")
        cantidad= readLine()!!.toInt()
    }
    override fun toString(): String {
        return "Nombre: "+nombre+"\nPrecio: "+precio+"\nCantidad: "+cantidad
    }
}
