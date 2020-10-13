package aquarium

class Aquarium(
    var width: Int = 20,
    var height: Int = 40,
    var length: Int = 20
) {

    var volume: Int
        get() = height * width * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    var water = volume * 0.9

    constructor(numberofFish: Int) : this() {
        val water = numberofFish*2000 // cm
        val tank = water + water*0.1
        height = (tank/(length*width)).toInt()
    }
}