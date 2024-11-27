open class Circunferencia (val radio: Double = 1.0, ){

    constructor(puntoCentro: Array<Double> = arrayOf(0.0,0.0),
                puntoCualquiera: Array<Double> = arrayOf(1.0,1.0)) : this(1.0)

     override fun toString(): String {
        return "Circunferencia:\n" +
                "Radio: $radio\n" +
                "Diametro: ${radio*2}"


    }

}