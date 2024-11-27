open class Circunferencia (val radio: Double = 1.0,
                           val puntoCentro: Array<Double> = arrayOf(0.0,0.0),
                           val puntoCualquiera: Array<Double> = arrayOf(0.0,0.0), ){
    val diametro: Double = radio*2

    constructor(puntoCentro: Array<Double> = arrayOf(0.0,0.0),
                puntoCualquiera: Array<Double> = arrayOf(1.0,1.0)) : this(1.0,puntoCentro,puntoCualquiera)



     override fun toString(): String {
        return "Circunferencia:\n" +
                "Radio: $radio\n" +
                "Diametro: $diametro\n" +
                "Punto Cualquiera: x= ${puntoCualquiera[0]} y= ${puntoCualquiera[1]}\n"+
                "Punto Centro: x= ${puntoCentro[0]} y= ${puntoCentro[1]} "

    }
    fun longitud():Double{
        return diametro*Math.PI
    }

}