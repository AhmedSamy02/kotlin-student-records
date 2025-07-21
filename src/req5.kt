fun above60(scores: Map<String, Int>) {
    scores.filter { it.value >= 60 && !it.key.isEmpty() }.forEach { (key, value) -> println("$key: $value") }
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