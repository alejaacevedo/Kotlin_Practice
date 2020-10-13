import java.util.*

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
fun main(args : Array<String>) {
    val input = Scanner(System.`in`)
    val lightX = input.nextInt() // the X position of the light of power
    val lightY = input.nextInt() // the Y position of the light of power
    val initialTx = input.nextInt() // Thor's starting X position
    val initialTy = input.nextInt() // Thor's starting Y position

    var currentTy= initialTy
    var currentTx= initialTx
    // game loop
    while (true) {
        val remainingTurns = input.nextInt() // The remaining amount of turns Thor can move. Do not remove this line.
        var directionX = ""
        var directionY = ""
        // Write an action using println()
        // To debug: System.err.println("Debug messages...");
        if( currentTx > lightX ){
            directionX = "W"
            currentTx -= 1
        } else if(currentTx < lightX){
            directionX="E"
            currentTx+=  1
        }
        if( currentTy > lightY ){
            directionY = "N"
            currentTy -=  1
        } else if(currentTy < lightY){
            directionY="S"
            currentTy+=1
        }

        // A single line providing the move to be made: N NE E SE S SW W or NW
        println(directionY+directionX)
    }

    // Altrenative solutions

 /*   while (true) {
        val remainingTurns = input.nextInt() // The remaining amount of turns Thor can move. Do not remove this line.

        println(
            with(initialTy.compareTo(lightY)) {
                initialTy -= this
                when (this) { -1 -> "S"
                    1 -> "N"
                    else -> ""
                }
            }
                    +
                    with(initialTx.compareTo(lightX)) {
                        initialTx -= this
                        when (this) { -1 -> "E"
                            1 -> "W"
                            else -> ""
                        }
                    }
        )
    }*/



}

