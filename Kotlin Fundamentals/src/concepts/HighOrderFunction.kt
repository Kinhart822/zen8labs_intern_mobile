package concepts

// Ví dụ 1: Hàm nhận một hàm khác làm tham số
fun operateOnNumbers(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}

//  Ví dụ 3: Hàm trả về một hàm khác
fun getOperation(type: String): (Int, Int) -> Int {
    return when (type) {
        "add" -> { a, b -> a + b }
        "mul" -> { a, b -> a * b }
        else -> { _, _ -> 0 }
    }
}

fun sum(x: Int, y: Int) = x + y

fun main() {

    // VD1
    val result = operateOnNumbers(5, 3, ::sum)
    println(result) // Output: 8

    // Ví dụ 2: Truyền lambda vào hàm
    val result1 = operateOnNumbers(10, 2) { x, y -> x * y }
    println(result1) // Output: 20

    // VD3
    val addFunction = getOperation("add")
    println(addFunction(4, 2)) // Output: 6
}
