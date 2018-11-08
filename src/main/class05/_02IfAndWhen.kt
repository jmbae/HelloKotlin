package main.class05

enum class Color {
    BLUE, ORANGE, RED
}

fun updateWeather(celsiusDegrees: Double) {
    val description: String
    val color: Color
    when {
        celsiusDegrees < 0 -> {
            description = "cold"
            color = Color.BLUE
        }
        celsiusDegrees in 0..15 -> {
            description = "mild"
            color = Color.ORANGE
        }
        else -> {
            description = "hot"
            color = Color.RED
        }
    }
}

fun updateWeather1(celsiusDegrees: Double) {
    val (description, color) =
            when {
                celsiusDegrees < 0 -> Pair("cold", Color.BLUE)
                celsiusDegrees in 0..15 -> "mild" to Color.ORANGE
                else -> "hot" to Color.RED
            }
}

fun main(args: Array<String>) {
    val result = "Value1"

    val ifValue = if (result == "Value") {
        println("It's a value")
        "Returning from if is true"
    } else {
        println("It is not.")
        "Returning from if is false"
    }
    println(ifValue)

    val whenValue = when (result) {
        "Value" -> {
            println("It's a value")
            println("Second statement")
            "Returning from first when case"
        }
        is String -> {
            println("Excellent")
            "Remove that"
        }
        else -> {
            println("It came to this?")
            "This warning is now gone"
        }
    }
    println(whenValue)

    println(updateWeather(10.0))
}