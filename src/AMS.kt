import java.util.*

val rollDice = { Random().nextInt(12) + 1 }

fun main(args: Array<String>) {
    println("the number is ${rollDice.toString()}")
    println(
        "Sum of 1 + 2 is " +
                " ${evaluate(Sum(Const(1.0), Const(2.0)))}"
    )
    val me = Person("Romain", "Bsl", Address(city = "Nivelles"))
    println("${me.firstname} ${me.lastname} lives in city: ${me.address?.city}; street: ${me.address?.street ?: "[no street defined]"}")
    val input = Scanner(System.`in`)
    var game = true
        while (game) {
            println((0..7).maxBy { input.nextInt() })
               game = false
        }

}

data class Address(val city: String, val street: String? = null)
data class Person(val firstname: String, val lastname: String?, val address: Address?)

sealed class ArithmenticExpression
data class Const(val number: Double) : ArithmenticExpression()
data class Sum(val left: ArithmenticExpression, val right: ArithmenticExpression) : ArithmenticExpression()

fun evaluate(exp: ArithmenticExpression): Double =
    when (exp) {
        is Const -> exp.number
        is Sum -> evaluate(exp.left) + evaluate(exp.right)
    }