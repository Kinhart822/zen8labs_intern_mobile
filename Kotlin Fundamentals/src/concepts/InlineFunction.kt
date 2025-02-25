package concepts

inline fun <T> performAction(action: () -> T): T {
    println("Before action")
    val result = action()  // Gọi action, một lambda
    println("After action")
    return result
}

inline fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

inline fun measureTime(block: () -> Unit) {
    val start = System.nanoTime()
    block()
    val end = System.nanoTime()
    println("Time taken: ${end - start} ns")
}

fun main() {
    val result = performAction {
        println("Action is being performed")
        42  // Trả về giá trị từ lambda
    }
    println("Result: $result")

    val result1 = calculate(10, 5) { x, y -> x + y }
    println(result1) // Output: 15

    measureTime {
        println("Running...")
    }
}