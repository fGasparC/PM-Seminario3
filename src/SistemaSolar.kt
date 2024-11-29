class SistemaSolar {
    var planetas: MutableList<Planeta> = mutableListOf()

    fun addPlaneta(planeta: Planeta) {
        planetas.add(planeta)
    }
    fun planetaMayor():Planeta{
        if(planetas.isEmpty()){
            return Planeta()
        }
        else {
            var max = planetas[0]
            for (planeta in planetas) {
                if (planeta.masa > max.masa) {
                    max = planeta
                }
            }
            return max
        }
    }
    fun planetaMenor():Planeta {
        if (planetas.isEmpty()) {
            return Planeta()
        } else {
            var min = planetas[0]
            for (planeta in planetas) {
                if (planeta.masa < min.masa) {
                    min = planeta
                }
            }
            return min
        }
    }
    fun mostrarPlanetas(){
        for (planeta in planetas) {
            println(planeta.toString())
        }
    }
    fun mostrarPlanetasQueEmpiecenConLaLetrita(letrita: Char){
        for (planeta in planetas) {
            if(planeta.nombre[0].lowercase()==letrita.lowercase()){
                println(planeta.toString())
            }
        }
    }
    fun mostrarPlanetasGaseososConMasaVeinteVecesMayorTierra():List<Planeta>?{
        var listaPlanetas: MutableList<Planeta> = mutableListOf()
        for (planeta in planetas) {
            if(planeta.tipo=="Gaseoso" && planeta.masa>(20*597)) listaPlanetas.add(planeta)
        }
        if (listaPlanetas.size==0) return null
        else return listaPlanetas
    }
    fun masaMedia():Float{
        var masa=0
        for (planeta in planetas) {
            masa+=planeta.masa
        }
        return (masa/planetas.size).toFloat()
    }
}