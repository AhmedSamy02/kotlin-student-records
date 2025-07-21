fun req4() {
    val scores = mapOf<String, Int>(
        "Ahmed" to 50,
        "Samy" to 84,
        "Mohamed" to 98,
        "Aya" to 62,
        "Ayman" to 77,
        "Eman" to 58,
        "Nancy" to 100
    )
    val total_score = scores.map { it.value }.reduce { acc, i -> acc + i }
    println("Total score of all students = $total_score")
    val output = scores.entries.fold("") { acc, entry ->
        if (acc.isEmpty()) "${entry.key}: ${entry.value}"
        else "$acc | ${entry.key}: ${entry.value}"
    }
    println(output)
}