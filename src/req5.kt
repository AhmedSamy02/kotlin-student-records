fun above60(scores: Map<String, Int>) {
    val filteredScores = scores.filter { it.value >= 60 && !it.key.isEmpty() }
    if (filteredScores.isEmpty()) {
        println("There's no students scores above 60")
    } else {
        filteredScores.forEach { (key, value) -> println("$key: $value") }
    }
}

fun req5() {
    val scores = mapOf<String, Int>(
        "Ahmed" to 50,
        "Samy" to 84,
        "Mohamed" to 98,
        "Aya" to 62,
        "Ayman" to 77,
        "Eman" to 58,
        "Nancy" to 100
    )
    above60(scores)
}