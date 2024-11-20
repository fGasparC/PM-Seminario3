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
}