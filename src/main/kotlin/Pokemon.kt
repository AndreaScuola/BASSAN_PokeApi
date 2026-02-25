package org.example

data class Pokemon(
    val id: Int,
    val name: String,
    val height: Int,
    val weight: Int,
    val types: List<String>
) {

    fun getId(): Int = id
    fun getName(): String { return name; }
    fun getHeight(): Int = height
    fun getWeight(): Int = weight

    override fun toString(): String {
        return """
            ID: $id
            Nome: $name
            Altezza: $height
            Peso: $weight
            Tipi: ${types.joinToString(", ")}
        """.trimIndent()
    }
}