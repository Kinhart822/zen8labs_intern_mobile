package concepts

fun operate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

fun main() {
    // Using lambda with function reference
    val square: (Int) -> Int = { number -> number * number } // Lambda
    println(square(4)) // Output: 16

    // Lambda sử dụng it (Implicit Name) - nếu lamda chỉ có 1 tham số truyền vào
    val square1: (Int) -> Int = { it * it }
    println(square1(4)) // Output: 16

    // Lambda làm tham số của hàm
    val result = operate(10, 5) { x, y -> x - y }
    println(result) // Output: 5
}
