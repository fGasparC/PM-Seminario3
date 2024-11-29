class Guerrero(nombre: String, PV: Double, PM: Double) : PNJ(nombre, PV, PM) {
    override fun levelUp() {
        super.levelUp()
        PV *= 1.08
        PM *= 1.01
    }
}