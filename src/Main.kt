import java.lang.Math.abs

fun main(args : Array<String>){

    val spice = SimpleSpice()
    println( " The spice is ${spice.name} and its spiciness level is ${spice.heat}")

    val ts = arrayOf(-3,-5,-8,-1,2,3,4,10,1,5)
    val test2 = arrayOf(7,5,9,1,4)
    val test3 = arrayOf(-15,-7,-9,-14,-12)


    println(closestToZero(ts).toString())
    println(closestToZero(test2).toString())
    println(closestToZero(test3).toString())

    println(ts.sortedArray().joinToString(separator = ","))
    highOrder(::println)
    highOrder {println(it)}

    val animals = listOf("dog", "cat", "snake")
    for ((animal, index) in animals.withIndex()) {
        println("animal at $index is $animal")
    }
    var index = 0
    while(index <animals.size){
        println("animal at $index is ${animals[index]}")
        index++
    }

    // SHORTEST WAY TO KNOW WHICH IS THE CLOSEST TEMP TO ZERO
        readLine()
        println(readLine()!!
            .split(" ")
            .filter(String::isNotEmpty)
            .map(String::toInt)
            .sorted()
            .reversed()
            .minBy{kotlin.math.abs(it)} ?: 0)
}
fun highOrder( block: (String) -> Unit){
    block("Welcome to the game")
}

fun closestToZero( ts: Array<Int>): Int{
    if (ts.isEmpty()) return 0
    var abCurr = 0
    var closer = ts[0]
    for(t in ts){
        abCurr = kotlin.math.abs(t)
        var absCloser = abs(closer)
        if(abCurr < absCloser){
            closer = t
        }
        else if (absCloser == abCurr && closer < 0){
            closer = t
        }
    }
    return closer
}

fun getSum( s: Int): Int{
    var sum =0;
    var currentS = s
    while (currentS !=0){
        sum += s % 10
        currentS = s/10
    }
    return sum
}
