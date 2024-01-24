import kotlin.math.PI
import java.util.*
class Cercle {

    private var radi: Float = 0.0f
    private var color: String = "blanc"

    fun perimetre(): Float {
        return 2 * PI.toFloat() * radi
    }

    fun area(): Float {
        return PI.toFloat() * radi * radi
    }

    override fun toString(): String {
        return ""
    }

    constructor() {
        demanarRadi()
        demanarColor()
    }

    constructor(radi: Float) {
        this.radi = radi
        demanarColor()
    }

    constructor(radi: Float, color: String) {
        this.radi = radi
        this.color = color
    }

    fun getRadi(): Float {
        return radi
    }

    fun getColor(): String {
        return color
    }

    fun setRadi(radi: Float) {
        this.radi = radi
    }

    fun setColor(color: String) {
        this.color = color
    }

    private fun demanarRadi() {
        val scan = Scanner(System.`in`)
        print("Introdueix el radi del cercle: ")
        radi = scan.nextFloat()
    }

    private fun demanarColor() {
        val scan = Scanner(System.`in`)
        print("Introdueix el color del cercle: ")
        color = scan.next()
    }
}