fun req2() {
    val names = listOf<String>("Ahmed", "Samy", "Mohamed", "Aya", "Ayman", "Eman", "Nancy")
    val scores = mapOf<String, Int>(
        "Ahmed" to 50,
        "Samy" to 84,
        "Mohamed" to 98,
        "Aya" to 62,
        "Ayman" to 77,
        "Eman" to 58,
        "Nancy" to 100
    )
    val graduated = setOf<String>("Ahmed", "Nancy")
    println("==================================")
    println("Student names:")
    names.forEach { str -> println(str) }
    println()
    println("==================================")
    println("Score of Mohamed is ${scores["Mohamed"]}")
    println("Score of Nancy is ${scores["Nancy"]}")
    println()
    println("==================================")
    print("Graduated Students are: ")
    println(names.filter { it in graduated })
    println()
    println("==================================")
}