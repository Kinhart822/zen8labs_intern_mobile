package concepts

fun main(args: Array<String>) {

    // For step range
    for (i in 1..10) {
        println(i)
    }

    // For step down range
    for (i in 10 downTo 1) {
        println(i)
    }

    // For step by step
    for (i in 1..10 step 2) {
        println(i)
    }

    // For step by step (down)
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    // For closed range
    for (i in 1..10) {
        println(i)
        println("$i * 2 = " + i * 2)
    }

    // For half-closed range
    for (i in 1 until 10) {
        println(i)
        println("$i * 2 = " + i * 2)
    }

    // For in collection
    val list = listOf(1, 2, 3, 4, 5)
    for (i in list) {
        println(i)
    }

    var dsTen = arrayOf("anh1.jpg", "anh2.jpg", "anh3.jpg")
    for (item in dsTen) {
        println(item)
    }

    // Nested For
    for (i in 1..3) {
        for (j in 1..5) {
            println("$i * $j = " + i * j)
        }
        println("--------------")
    }

    var h = 7
    for (i in 1..h) {
        for (j in 1..h) {
            print("$i$j ")
        }
        println()
    }
}