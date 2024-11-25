class ListaEstudiantes() {
    var estudiantes=mutableListOf<Estudiante>()


    fun agregarEstudiante(estudiante: Estudiante){
        estudiantes.add(estudiante)
    }

    fun mostrarEstudiante(nombre:String?){
        for (estudiante in estudiantes){
            if(estudiante.nombre==nombre){
                println(estudiante.toString())
            }

        }
    }
    fun mostrarEstudiantes(){
        for (estudiante in estudiantes){
            println("Nombre: ${estudiante.nombre}")
            println("Edad: ${estudiante.edad}")
            println("Calificaciones: ${estudiante.calificaciones}")
            println("///////////////////////////////")
        }
    }
    fun calculaPromedios(): Float {
        var sum=0f
        for (estudiante in estudiantes){
            sum+=estudiante.calificaciones
        }
        return (sum/estudiantes.size)
    }
}
