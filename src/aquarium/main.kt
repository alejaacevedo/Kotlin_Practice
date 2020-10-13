package aquarium

fun main(args: Array<String>) {
    buildAquarium()
}

private fun buildAquarium() {
    val aquarium1 = Aquarium()
    println(
        "Length: ${aquarium1.length} " +
                "Width: ${aquarium1.width} " +
                "Height: ${aquarium1.height}"
    )
    aquarium1.height = 60
    println( " new aquarium's height is ${aquarium1.height}")
    println( " volume: ${aquarium1.volume} liters")

    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
    println( " The small aquarium volume is : ${smallAquarium.volume}")

    val aquarium2 = Aquarium(numberofFish = 9)
    println(
        "Volume: ${aquarium2.volume} liters " +
                "Length: ${aquarium2.length} " +
                "Width: ${aquarium2.width} " +
                "Height: ${aquarium2.height}"
    )

}