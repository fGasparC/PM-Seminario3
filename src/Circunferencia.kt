open class Circunferencia (val radio: Double) {
    val punto: Array<Double> = Array(2){0.0}
    val diametro: Double= radio*2

    constructor(radio: Double, punto: Array<Double>): this(radio)

     override fun toString(): String {
        return "Circunferencia:\n" +
                "Radio: $radio\n" +
                "Diametro: $diametro\n" +
                "Punto: x= ${punto[0]} y= ${punto[1]}"
    }
    fun longitud():Double{
        return diametro*Math.PI
    }
}