import kotlin.random.Random

class Champions {
    var listaEquipos=mutableListOf<EquipoFutbol>()

    fun addEquipo(equipo: EquipoFutbol){
        var contador=0
        for (i in listaEquipos){
            if (i.pais.lowercase()==equipo.pais.lowercase()){
                contador +=1
            }
        }
        if (contador>=4){
            println("No se puede añadir el equipo ${equipo.nombre} porque ya hay 4 equipos de ese pais")
        }
        else{
            listaEquipos.add(equipo)
            println("Se ha añadido el equipo a la Champions League correctamente.")
        }
    }
    fun championsLeague(listaOctavos : MutableList<EquipoFutbol> =listaEquipos ){
        if (listaEquipos.size ==16){
            //Algoritmo Fisher-Yates
            for (i in listaOctavos.size - 1 downTo 1) {
                val j = Random.nextInt(i + 1)
                val temp = listaOctavos[i]
                listaOctavos[i] = listaOctavos[j]
                listaOctavos[j] = temp
            }
            println("Sorteo de Octavos")
            for(i in 0 until listaOctavos.size step 2){
                println("$ANSI_BLUE${listaOctavos[i].nombre}$ANSI_RESET vs $ANSI_RED${listaOctavos[i+1].nombre}$ANSI_RESET")
            }
        }
        else println("${ANSI_RED}Debe haber 16 equipos para hacer el sorteo de Octavos$ANSI_RESET")

    }
}