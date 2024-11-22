class Contacto() {
    var nombre=""
    var telefono=""
    var email=""

    init {
        creaContactos()
    }

    fun creaContactos() {
        println("Introduce el nombre del contacto")
        nombre = readLine() ?: "null"
        println("Introduce el numero del contacto")
        telefono = readLine() ?: "null"
        println("Introduce el email del contacto")
        email= readLine() ?: "null"
    }
    override fun toString(): String {
        return "Nombre: "+nombre+"\nTelefono: "+telefono+"\nEmail: "+email
    }
}