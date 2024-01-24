import java.util.*

fun main() {
    menu()
}

fun menu() {
    val scan = Scanner(System.`in`)
    var cercle: Cercle? = null
    do {
        printOpcionsMenu()
        val opcioMenu = scan.nextInt()
        when (opcioMenu) {
            1 -> cercle = Cercle()
            2 -> {
                print("Introdueix el radi del cercle: ")
                val radi = scan.nextFloat()
                cercle = Cercle(radi)
            }
            3 -> {
                if (cercle != null) {
                    println(cercle)
                } else {
                    println("Encara no s'ha creat cap cercle.")
                }
            }
            4 -> {
                if (cercle != null) {
                    println("Perímetre: ${cercle.perimetre()}")
                } else {
                    println("Encara no s'ha creat cap cercle.")
                }
            }
            5 -> {
                if (cercle != null) {
                    println("Àrea: ${cercle.area()}")
                } else {
                    println("Encara no s'ha creat cap cercle.")
                }
            }
            6 -> println("Sortir")
            else -> println("ERROR")
        }
    } while (opcioMenu != 6)
}

fun printOpcionsMenu() {
    println("1.- Crear un cercle d'un radi determinat i d'un color determinat")
    println("2.- Crear un cercle d'un radi determinat")
    println("3.- Mostrar últim cercle creat")
    println("4.- Mostrar perímetre últim cercle creat")
    println("5.- Mostrar àrea últim cercle creat")
    println("6.- Sortir")
}