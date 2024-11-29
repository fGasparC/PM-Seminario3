open class PNJ(val nombre: String, var PV: Double, var PM: Double, var LVL: Int = 1) {
    open fun levelUp() {
        LVL++
    }
}