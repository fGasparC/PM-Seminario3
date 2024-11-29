class BlocDeNotas {
    private val notas: MutableList<Nota> = mutableListOf()

    fun agregarNota(nota: Nota) {
        notas.add(nota)
    }

    fun eliminarNota(posicion: Int) {
        if (posicion in notas.indices) {
            notas.removeAt(posicion)
        } else {
            println("Posición inválida")
        }
    }

    fun contarNotas(): Int {
        return notas.size
    }

    fun listarNotas() {
        notas.forEach { println(it) }
    }
}