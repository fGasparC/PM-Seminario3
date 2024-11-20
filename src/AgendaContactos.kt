class AgendaContactos (){
    var contactos=mutableListOf<Contacto>()


    fun agregarContactos(contacto: Contacto){
        contactos.add(contacto)
    }
    fun eliminarContactos(nombre:String){
        for (contacto in contactos){
            if (contacto.nombre==nombre)
                contactos.remove(contacto)
        }
    }

    fun mostrarContacto(nombre:String?){
        for (contacto in contactos){
            if(contacto.nombre==nombre){
                contacto.toString()
            }
        }
    }
    fun mostrarTodosContactos(){
        for (contacto in contactos){
            println("Nombre: ${contacto.nombre}")
            println("Telefono: ${contacto.telefono}")
            println("Email: ${contacto.email}")
            println("///////////////////////////////")
        }
    }
}