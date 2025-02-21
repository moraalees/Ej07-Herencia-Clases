package src

open class Vehiculo(val marca: String, var capacidadCombustible: Int) {

    fun mostrarInfo(){
        println("Vehiculo(marca = $marca, capacidad de combustible = $capacidadCombustible litros).")
    }

    open fun calcularautonomia(): Int{
        val autonomia = capacidadCombustible * 10
        println("La autonomía del vehículo es de $autonomia.")
        return autonomia
    }

}