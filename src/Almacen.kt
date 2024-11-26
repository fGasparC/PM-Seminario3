class Almacen {
    var almacen=mutableListOf<Producto>()


    fun agregarProducto(producto: Producto){
        almacen.add(producto)
    }
    fun mostrarProductos(){
        for (i in 0..almacen.size-1){
            println("Producto " + i + ": " + almacen[i].toString())
        }
    }
    fun actualizarStock(){
        mostrarProductos()
        println("Introduce el numero del producto al que le deseas actualizar el stock")
        val indiceProducto= readLine()!!.toInt()
        println("Introduce el stock del producto")
        val nuevoStock= readLine()!!.toInt()
        almacen[indiceProducto].cantidad=nuevoStock
        println("El stock del producto: ${almacen[indiceProducto].nombre} se ha actualizado con exito.\n" +
                "Actualmente tiene un stock de: ${almacen[indiceProducto].cantidad}")
    }
}