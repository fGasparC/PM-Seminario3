/*
Ejercicio 1. Crea la clase de datos Planeta.
Cada planeta tendrá un nombre, tipo –Rocoso o gaseoso- y una masa. Crea la clase
sistema solar la cual tendrá una lista de planetas y los métodos .planetaMayor() que
devuelve el planeta de mayor masa, .planetaMenor() que devuelve el planeta de menor
masa y .masaMedia() que devuelve la masa media de los planetas del sistema solar.

Ejercicio 2. Crear la clase triangulo. Propiedades: longitud de los tres lados, perímetro, tipo
de triángulo (isósceles, escaleno o equilátero). Implementar el método
.rectangulo():Boolean que calcula si el triángulo es rectángulo. Nota (se parte de la
hipótesis de que la longitud de los lados dados crean un triángulo
____
Ejercicio 3: Gestión de Contactos
Crea una clase llamada Contacto que represente la información de un contacto en una lista de contactos. La
clase debe tener propiedades como nombre, número de teléfono y dirección de correo electrónico. Luego,
crea una lista de objetos Contacto y permite a los usuarios agregar, eliminar y mostrar contactos.

Ejercicio 4: Registro de Estudiantes
Crea una clase llamada Estudiante que contenga información como nombre, edad y calificaciones. Luego,
crea una lista de objetos Estudiante y permite a los usuarios agregar nuevos estudiantes, mostrar la
información de un estudiante en particular y calcular el promedio de calificaciones de todos los estudiantes.

Ejercicio 5: Control de Inventario
Crea una clase Producto que represente productos en un inventario. La clase debe tener propiedades como
nombre del producto, precio y cantidad en stock. Luego, crea una lista de objetos Producto y permite a los
usuarios agregar nuevos productos, actualizar el stock y mostrar el inventario.

Ejercicio 6. Crea una lista con los nueve planeta del Sistema Solar.
Usa la clase planeta creada en el ejercicio 1

Ejercicio 7. Muestra por pantalla toda la información de todos los planetas

Ejercicio 8. Muestra por pantalla todos los planetas que empiecen por la letra ‘M’

Ejercicio 9. Muestra por pantalla todos los planetas gaseosos cuya masa sea
superior a 20 veces la de la tierra

Ejercicio 10. Muestra por pantalla la masa media de los planetas del sistema solar

Ejercicio 11. Crea la clase equipo de fútbol que contenga el nombre y país
del equipo

Ejercicio 12. Crea una lista con 16 equipos de fútbol de países distintos (no
puede haber más de cuatro equipos por país)

Ejercicio 13. Crea la función championsLeague() que recibe como entrada la
lista con los 16 equipos y muestra por pantalla un sorteo de octavos* de final
de la Champions. *(no tengas en cuenta que equipos de un mismo país no
pueden enfrentarse)
Ejercicio 14: Crea la clase circunferencia. El constructor primario recibirá el
radio de la circunferencia y el secundario recibirá la posición del centro de la
circunferencia y un punto cualquiera de la misma. Crear el método longitud()
y sobrecargar el método toString() de forma que muestre toda la info de la
circunferencia

Ejercicio 15: Crea la clase Círculo que hereda de circunferencia. Tendrá dos
constructores, el primero recibirá el radio y el color del círculo y el segundo
su centro, un punto cualquiera y su color. Crear el método área() y
sobrecargar el método toString() de forma que muestre toda la info de la
circunferencia

Ejercicio 16: Clase de matemáticas. Crea una clase Matemáticas con métodos para realizar
operaciones matemáticas como sumar, restar, multiplicar y dividir. Luego, utiliza esta clase en tu
programa principal.

Ejercicio 17: Implementa las siguientes clases:
    clase Nota. Una nota contiene un identificador numérico y una línea de texto. Define
    constructor, accedentes y toString.
    clase NotaAlarma. Una nota que además contiene la hora en la que sonará la alarma. Define
    constructor, accedentes y toString.
    clase BlocNotas que modela un bloc de notas en el que se pueden introducir notas, listar
    todas las notas, eliminar una nota mediante su posición en el bloc de notas o saber cuantas
    notas contiene el bloc de notas. Debes utilizar una colección.
    clase Prueba que cree un bloc de Notas de ejemplo y pruebe las operaciones que soporta. .

Ejercicio 18: Define una jerarquía de clases que permita almacenar datos sobre los
planetas y satélites que forman parte del sistema solar (junto con el sol).
Algunos atributos que puede ser interesante recoger son: la masa del
cuerpo, su diámetro medio, el período de rotación sobre el propio eje,
período de traslación alrededor del cuerpo que orbitan, distancia media a
ese cuerpo, excentricidad de la órbita, etc.
Define un método que, dado un objeto del sistema solar (planeta o satélite),
imprima toda la información de que se dispone sobre el mismo.

Ejercicio 19: Crea la clase PNJ que representa un personaje en un juego de rol.
La clase tendrá los atributos, nombre, PV –Puntos de Vida-, PM
–Puntos mágicos- y LVL. Crea las clases hijas de PNJ Guerrero y
Mago. Dichas clases implementarán el método levelUp() que
incrementa el atributo LVL del personaje y sus atributos PV y MP.
Los guerreros por cada nuevo nivel tendrán un 8% más de PV y un
1% más de PM mientras que los magos tendrán un 4% más de PV y
un 3% más de PM. Crear un guerrero de nivel 1 con 400PV y 50PM y
un mago de nivel 1 con 1600PV y 150PM. Partiendo del hecho de
que ambos personajes subirán de nivel siempre a la vez ¿en qué
nivel el guerrero tendrá más PV que el mago?

Ejercicio 20: Crea la clase de datos Videojuego, que tendrá nombre, año y plataforma del
juego. Crea una lista con 8 videojuegos de tres plataformas distintas. Crea una función
que dada una lista de juegos, una año y una plataforma devuelve los juegos de la lista de
dicho año y plataforma. La función también debe poder usarse especificando solo el año
o solo la plataforma.

Ejercicio 21: Crear una función que dada una lista de videojuegos, lista de años y lista de
plataformas devuelva los juegos de la lista que fueron creados en esos años y para esas
plataformas. La función debe poder usarse si solo se especifica la lista de años o la lista
de plataformas.

Ejercicio 22. Crea una función que reciba una lista de juegos y devuelva un mapa
donde las claves sean las plataformas y el valor el número de juegos para dicha
plataforma.

 */
val ANSI_PURPLE = "\u001B[35m"
val ANSI_RESET = "\u001B[0m"
var sistemaSolar=SistemaSolar()
var sistSolarcreado=false

fun main() {

    println("Elige ejercicio")
    var ejercicio = readLine()!!.toInt()
    when(ejercicio){
        1 -> {
            println("Ejercicio 1\nEs la clase Planeta.")
        }
        2 -> {
            println("Ejercicio 2\nEs la clase Triangulo")
        }
        3 -> {
            println("Ejercicio 3")
            ej3()
        }
        4 -> {
            println("Ejercicio 4")
            ej4( )
        }
        5 -> {
            println("Ejercicio 5")
            ej5()
        }
        6 -> {
            println("Ejercicio 6")
            ej6()
            println("Se ha creado el Sistema Solar.")
        }
        7 -> {
            println("Ejercicio 7")
            if (sistSolarcreado==false) ej6()
            sistemaSolar.mostrarPlanetas()

        }
        8 -> {
            println("Ejercicio 8")
            if (sistSolarcreado==false) ej6()
            sistemaSolar.mostrarPlanetasQueEmpiecenConLaLetrita('M')
        }
        9 -> {
            println("Ejercicio 9")
            if (sistSolarcreado==false) ej6()
            sistemaSolar.mostrarPlanetasGaseososConMasaVeinteVecesMayorTierra()
        }
        10 -> {
            println("Ejercicio 10")
            if (sistSolarcreado==false) ej6()
            println("La masa media del sistema solar es ${sistemaSolar.masaMedia()}")
        }
        11 -> println("Ejercicio 11")
        12 -> println("Ejercicio 12")
        13 -> println("Ejercicio 13")
        14 -> println("Ejercicio 14")
        15 -> println("Ejercicio 15")
        16 -> println("Ejercicio 16")
        17 -> println("Ejercicio 17")
        18 -> println("Ejercicio 18")
        19 -> println("Ejercicio 19")
        20 -> println("Ejercicio 20")
        21 -> println("Ejercicio 21")
        22 -> println("Ejercicio 22")
    }

}
fun ej3(){
    var agenda=AgendaContactos()
    println("¿Cuantos contactos quieres añadir a tu agenda?")
    var numContactos= readLine()!!.toInt()
    for(i in 0..numContactos-1){
        var contacto= Contacto()
        agenda.agregarContactos(contacto)
    }
    var exit=false
    var opcion = ""
    while (!exit) {
        println("Opcion: "+ opcion)
        println(
            "$ANSI_PURPLE Elige una opcion:\n" +
                    "1. Añadir un contacto\n" +
                    "2. Eliminar un contacto\n" +
                    "3. Mostrar lista de contactos\n" +
                    "4. Buscar un contacto por nombre\n"+
                    "0. Salir del programa $ANSI_RESET"
        )
        var opcion= readlnOrNull()
        when(opcion){
            "1"->{
                var nuevocontacto=Contacto()
                agenda.agregarContactos(nuevocontacto)
            }
            "2"->{
                var contactoEliminar= readLine().toString()
                agenda.eliminarContactos(contactoEliminar)
            }
            "3"->{
                agenda.mostrarTodosContactos()
                println("Pulsa enter para volver al menu")
                var volver = readLine().toString()
            }
            "4"->{
                println("Introduce el nombre:")
                var contactoBuscar= readLine().toString()
                agenda.mostrarContacto(contactoBuscar)
            }
            "0"->{
                println("Hasta luego.")
                exit=true
            }
            else-> println("$opcion no es una opcion valida.")
        }
    }
}
fun ej4(){
    var lista=ListaEstudiantes()
    println("¿Cuantos estudiantes quieres añadir a tu lista de estudiantes?")
    var numEstudiantes= readLine()!!.toInt()
    for(i in 0..numEstudiantes-1){
        var estudiante= Estudiante()
        lista.agregarEstudiante(estudiante)
    }
    var exit=false
    var opcion = ""
    while (!exit) {
        println("Opcion: "+ opcion)
        println(
            "$ANSI_PURPLE Elige una opcion:\n" +
                    "1. Añadir un estudiante.\n" +
                    "2. Mostrar un estudiante.\n" +
                    "3. Mostrar promedio de los estudiantes.\n"+
                    "0. Salir del programa $ANSI_RESET"
        )
        var opcion= readlnOrNull()
        when(opcion){
            "1"->{
                var nuevoEstudiante=Estudiante()
                lista.agregarEstudiante(nuevoEstudiante)
            }
            "2"->{
                println("Introduce el nombre:")
                var estudianteBuscar= readLine().toString()
                lista.mostrarEstudiante(estudianteBuscar)
            }
            "3"->{
                println("El promedio de los estudiantes es ${lista.calculaPromedios()}")
            }
            "0"->{
                println("Hasta luego.")
                exit=true
            }
            else-> println("$opcion no es una opcion valida.")
        }
    }
}
fun ej5(){
    var almacen=Almacen()
    println("¿Cuantos productos quieres añadir a tu almacen?")
    var numProductos= readLine()!!.toInt()
    for(i in 0..numProductos-1){
        var producto= Producto()
        almacen.agregarProducto(producto)
    }
    var exit=false
    var opcion = ""
    while (!exit) {
        println("Opcion: "+ opcion)
        println(
            "$ANSI_PURPLE Elige una opcion:\n" +
                    "1. Añadir un producto.\n" +
                    "2. Mostrar productos.\n" +
                    "3. Actualizar el stock de un producto.\n"+
                    "0. Salir del programa $ANSI_RESET"
        )
        var opcion= readlnOrNull()
        when(opcion){
            "1"->{
                var nuevoProducto=Producto()
                almacen.agregarProducto(nuevoProducto)
            }
            "2"->{
                almacen.mostrarProductos()
                println("Pulsa enter para volver al menu")
                var volver = readLine().toString()
            }
            "3"->{
                almacen.actualizarStock()
            }
            "0"->{
                println("Hasta luego.")
                exit=true
            }
            else-> println("$opcion no es una opcion valida.")
        }
    }
}
fun ej6(){
    val nombresPlanetas= listOf("Mercurio", "Venus", "Tierra", "Marte", "Júpiter", "Saturno", "Urano", "Neptuno")
    val tiposPlanetas= listOf("Rocoso", "Rocoso", "Rocoso", "Rocoso", "Gaseoso", "Gaseoso", "Gaseoso", "Gaseoso")
    val masaPlanetas= listOf(330,486,597,64,1898,568,86,102) //Billones de kg
    for (i in 0 until nombresPlanetas.size){
        val planeta=Planeta(nombresPlanetas[i],tiposPlanetas[i],masaPlanetas[i])
        sistemaSolar.addPlaneta(planeta)
    }
    sistSolarcreado=true
}


