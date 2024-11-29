class NotaAlarma(id: Int, texto: String, val horaAlarma: String) : Nota(id, texto) {
    override fun toString(): String {
        return "NotaAlarma(id=$id, texto='$texto', horaAlarma='$horaAlarma')"
    }
}