import java.util.*

fun main() {
    val p1: Persona = Persona()
    println("$p1")

    val p2: Persona = Persona("Xavi", "Heredia")
    println("$p2")

    val p3: Persona = Persona("37674666T", "Mauricio", "Rashid", 40, false)
    println("$p3")

    println(p1.toString())

    println()
}
