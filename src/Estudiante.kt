class Estudiante() {
    var nombre=""
    var edad=0
    var calificaciones=0f

    init {
        creaEstudiante()
    }

    fun creaEstudiante() {
        println("Introduce el nombre del estudiante")
        nombre = readLine() ?: "null"
        try {
            println("Introduce la edad del estudiante")
            edad = readLine()!!.toInt()
            println("Introduce la calificacion del estudiante")
            calificaciones = readLine()!!.toFloat()
        }
        catch (e:Exception){
            println(e)
        }
    }
    override fun toString(): String {
        return "Nombre: "+nombre+"\nEdad: "+edad+"\nCalificaciones: "+calificaciones
    }
}
