/*
Ejercicio 2. Crear la clase triangulo. Propiedades: longitud de los tres lados, perímetro,
tipo de triángulo (isósceles, escaleno o equilátero). Implementar el método
.rectangulo():Boolean que calcula si el triángulo es rectángulo. Nota (se parte de la
hipótesis de que la longitud de los lados dados crean un triángulo)

 */
class Triangulo(var lA: Double=1.0,
    var lB: Double=1.0,
    var lC: Double=1.0,
    var perimetro:Double= lA+lB+lC,
    var tipo:String= "No definido"){


    fun rectangulo():Boolean{
        val listaLados=mutableListOf(lA,lB,lC)
        listaLados.sort()
        return ((Math.pow(listaLados[1],2.0) + Math.pow(listaLados[2],2.0))==Math.pow(listaLados[0],2.0))

    }
}