class Mago(nombre: String, PV: Double, PM: Double) : PNJ(nombre, PV, PM) {
    override fun levelUp() {
        super.levelUp()
        PV *= 1.04
        PM *= 1.03
    }
}