class Spice(val name: String, val spiciness: String = "mild") {
    val heat: Int
        get() {
            return when (spiciness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 9
                else -> 0
            }
        }


    init {
        println(" The spice is $name, and its spiciness is $spiciness")
    }


}

fun makesalt(name: String = "salt") = Spice(name)
fun main() {
    val spice = Spice("cayenne", "spicy")
    val spices: List<Spice> = listOf(
        Spice("curry"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger"),
        Spice("red curry", "medium"),
        Spice("green curry"),
        Spice("hot pepper", "extremely spicy")
    )

    val spiceList = spices.filter { it.heat > 5 }
    spiceList.forEach { spice -> println(spice.name) }
    val salt = makesalt()
}