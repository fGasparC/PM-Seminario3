/*
Ejercicio 1. Crea la clase de datos Planeta.
Cada planeta tendrá un nombre, tipo –Rocoso o gaseoso- y una masa. Crea la clase
sistema solar la cual tendrá una lista de planetas y los métodos .planetaMayor() que
devuelve el planeta de mayor masa, .planetaMenor() que devuelve el planeta de menor
masa y .masaMedia() que devuelve la masa media de los planetas del sistema solar.

 */
class Planeta (var nombre : String="Planeta",
               var tipo : String="Rocoso",
               var masa : Int=1){

    override fun toString(): String {
        return "$nombre/$tipo/$masa"
    }
}