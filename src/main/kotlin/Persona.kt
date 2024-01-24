class Persona (
    private val dni: String = "",
    private val nom: String = "",
    private val cognom: String = "",
    private var edad: Int = 0,
    private var estatCivil: Boolean = false
) {

    fun aniversari() {
        edad++
    }

    fun casament() {
        estatCivil = true
    }

    fun divorci() {
        estatCivil = false
    }

    override fun toString(): String {

        return "DNI: $dni, NOM: $nom, COGNOM: $cognom, EDAD: $edad, ESTAT CIVIL: $estatCivil"
    }

    constructor(): this("", "", "", 0, false) {

    }

    constructor(nom: String, cognom: String): this("",nom, cognom) {
        this.nom
        this.cognom
    }

    constructor(nom: String, cognom: String, edad: Int, estatCivil: Boolean): this("", nom, cognom, edad, estatCivil) {
        this.dni
        this.nom
        this.cognom
        this.edad
        this.estatCivil
    }
}
