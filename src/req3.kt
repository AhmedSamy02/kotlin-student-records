fun req3() {
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
    val uppercaseNames = names.map { it.uppercase() }
    println("Uppercase names = $uppercaseNames")
    print("Names of students scored > 80 : ")
    val above80 = scores.filter { it.value > 80 }.map { it.key }.forEach { it -> print("$it  ") }
}