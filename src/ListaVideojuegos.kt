class ListaVideojuegos {
    var videoJuegos: MutableList<Videojuego> = mutableListOf()

            fun devuelveJuegos(ano: Int, plataforma: String, ): List<Videojuego> {
            var juegosDevolver = mutableListOf<Videojuego>()
            for (juego in videoJuegos) {
                if (juego.ano == ano) {
                    if (juego.plataforma.contains(plataforma)) juegosDevolver.add(juego)
                }
            }
            return juegosDevolver
        }

        fun devuelveJuegos(ano: Int,): List<Videojuego> {
            var juegosDevolver = mutableListOf<Videojuego>()
            for (juego in videoJuegos) {
                if (juego.ano == ano) juegosDevolver.add(juego)
            }
            return juegosDevolver
        }

        fun devuelveJuegos(plataforma: String): List<Videojuego> {
            var juegosDevolver = mutableListOf<Videojuego>()
            for (juego in videoJuegos) {
                if (juego.plataforma.contains(plataforma)) juegosDevolver.add(juego)
            }
            return juegosDevolver
        }

    fun mapearJuegos(): Map<String,Int>{
        var mapa= mutableMapOf<String,Int>()
        for (juego in videoJuegos) {
            for (plataforma in juego.plataforma){
                if (mapa.containsKey(plataforma)){
                    mapa[plataforma] = mapa.getValue(plataforma) + 1
                }
                else{
                    mapa.put(plataforma,1)
                }
            }
        }
        return mapa
    }

    fun intersectaListas(listaAnos: MutableList<Int>,listaPlataformas: MutableList<String>):MutableList<Videojuego>{
        var jueguitosDevolver= mutableListOf<Videojuego>()
        for (juego in videoJuegos){
            if (listaAnos.contains(juego.ano)){
                jueguitosDevolver.add(juego)
            }
            for(plat in juego.plataforma){
                if(listaPlataformas.contains(plat)){
                    jueguitosDevolver.add(juego)
                }
            }
        }
        return jueguitosDevolver
    }

}