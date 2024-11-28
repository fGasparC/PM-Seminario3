/*
Ejercicio 20: Crea la clase de datos Videojuego, que tendrá nombre, año y plataforma del
juego. Crea una lista con 8 videojuegos de tres plataformas distintas. Crea una función
que dada una lista de juegos, una año y una plataforma devuelve los juegos de la lista de
dicho año y plataforma. La función también debe poder usarse especificando solo el año
o solo la plataforma.
 */
class Videojuego (val nombre : String,val ano: Int,val plataforma: List<String> ){

    companion object {
        fun crearVideojuegos(): MutableList<Videojuego> {
            val v1 = Videojuego("Silent Hill", 1999, listOf("playstation", "pc"))
            val v2 = Videojuego("Red Dead Redemption", 2010, listOf("playstation", "xbox", "pc"))
            val v3 = Videojuego("Mario Party", 1998, listOf("nintendo 64"))
            val v4 = Videojuego("Dark Souls", 2011, listOf("playstation", "pc", "xbox"))
            val v5 = Videojuego("Breath of the Wild", 2017, listOf("switch", "wii u"))
            val v6 = Videojuego("Civilization", 1991, listOf("pc"))
            val v7 = Videojuego("The Witcher", 2007, listOf("pc"))
            val v8 = Videojuego("Nintendogs", 5, listOf("ds"))
            return mutableListOf(v1, v2, v3, v4, v5, v6, v7, v8)
        }
    }

    fun devuelveJuegos(ano: Int, plataforma: String,lista: List<Videojuego>): List<Videojuego>{
        var juegosDevolver=mutableListOf<Videojuego>()
        for (juego in lista){
            if(juego.ano == ano){
                if (juego.plataforma.contains(plataforma)) juegosDevolver.add(juego)
            }
        }
        return juegosDevolver
    }
    fun devuelveJuegos(ano: Int,lista: List<Videojuego>): List<Videojuego>{
        var juegosDevolver=mutableListOf<Videojuego>()
        for (juego in lista){
            if (juego.ano == ano) juegosDevolver.add(juego)
        }
        return juegosDevolver
    }
    fun devuelveJuegos(plataforma: String,lista: List<Videojuego>): List<Videojuego>{
        var juegosDevolver=mutableListOf<Videojuego>()
        for (juego in lista){
            if (juego.plataforma.contains(plataforma)) juegosDevolver.add(juego)
        }
        return juegosDevolver
    }
}