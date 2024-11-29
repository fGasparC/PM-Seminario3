open class Circunferencia(val radio: Double) {

    constructor(centrox: Double, centroy: Double, puntox: Double, puntoy: Double) : this(
        Math.sqrt((puntox - centrox) * (puntox - centrox) + (puntoy - centroy) * (puntoy - centroy))
    )

    fun longitud(): Double {
        return 2 * Math.PI * radio
    }

    override fun toString(): String {
        return "Circunferencia(radio=$radio)"
    }
}