package src

fun main(){
    val auto = Automovil("Seat", 400, "Alhambra")
    val moto = Motocicleta("Kawasaki", 200, 20)

    auto.calcularautonomia()
    moto.calcularautonomia()
}