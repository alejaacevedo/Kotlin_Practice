import java.util.*
import kotlin.random.Random as Random1

val waterFilter: (Int) -> Int = { dirty: Int -> dirty / 2 }
var dirty = 20
fun feedTheFish(dirty: Int) = dirty + 10

// High order function takes a fun as a parameter
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}

// High order function call
fun dirtyProcessor(){
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedTheFish)
    dirty = updateDirty(dirty){ dirty -> dirty + 50} // possibility to create the function behavior as lambda
}

fun main(args: Array<String>) {
    println("Hello World")
    feedTheFish()

}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today it's $day and the fish eat $food")

    // calling dirty processor
    dirtyProcessor()
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "pellets"
        "Tuesday" -> "insects"
        "Wednesday" -> "grass"
        "Thursday" -> "flakes"
        "Friday" -> "lettuce"
        "Saturday" -> "plankton"
        else -> "fasting"
    }


}