package src

class Automovil(marca: String, capacidad: Int, val tipo: String): Vehiculo(marca, capacidad) {

    override fun calcularautonomia(): Int {
        val autonomia = capacidadCombustible * 10 + 100
        println("La autonomía del vehículo es de $autonomia.")
        return autonomia
    }

}