class Circulo : Circunferencia {

    val color: String

    constructor(radio: Double, color: String) : super(radio) {
        this.color = color
    }

    constructor(centrox: Double, centroy: Double, puntox: Double, puntoy: Double, color: String) : super(centrox, centroy, puntox, puntoy) {
        this.color = color
    }

    fun area(): Double {
        return Math.PI * radio * radio
    }

    override fun toString(): String {
        return "Círculo(radio=$radio, color=$color, área=${area()})"
    }
}