package src

class Motocicleta(marca: String, capacidad: Int, val cilindrada: Int): Vehiculo(marca, capacidad) {

    override fun calcularautonomia(): Int {
        val autonomia = capacidadCombustible * 10 - 40
        println("La autonomía del vehículo es de $autonomia.")
        return autonomia
    }

}