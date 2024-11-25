class Estudiante() {
    var nombre=""
    var edad=0
    var calificaciones=0f

    init {
        creaContactos()
    }

    fun creaContactos() {
        println("Introduce el nombre del contacto")
        nombre = readLine() ?: "null"
        println("Introduce el numero del contacto")
        edad = readLine()!!.toInt()
        println("Introduce el email del contacto")
        calificaciones= readLine()!!.toFloat()
    }
    override fun toString(): String {
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nCalificaciones: "+calificaciones
    }
}
