fun req1() {
    val names = listOf<String>("Ahmed", "Samy", "Mohamed", "Aya", "Ayman", "Eman", "Nancy")
    val namesMutable = mutableListOf<String>("Ahmed", "Samy", "Mohamed", "Aya", "Ayman", "Eman", "Nancy")
    val scores = mapOf<String, Int>(
        "Ahmed" to 50,
        "Samy" to 84,
        "Mohamed" to 98,
        "Aya" to 62,
        "Ayman" to 77,
        "Eman" to 58,
        "Nancy" to 100
    )
    val scoresMutable = mutableMapOf<String, Int>(
        "Ahmed" to 50,
        "Samy" to 84,
        "Mohamed" to 98,
        "Aya" to 62,
        "Ayman" to 77,
        "Eman" to 58,
        "Nancy" to 100
    )
    val graduated = setOf<String>("Ahmed", "Samy", "Mohamed", "Aya", "Ayman", "Eman", "Nancy")
    val graduatedMutable = mutableSetOf<String>("Ahmed", "Samy", "Mohamed", "Aya", "Ayman", "Eman", "Nancy")
    println("Names = $names")
    println()
    println("Scores = $scores")
    println()
    println("Graduated = $graduated")
    println()
    println("Mutable Names = $namesMutable")
    println()
    println("Mutable Scores = $scoresMutable")
    println()
    println("Mutable Graduated = $graduatedMutable")
    println()
}