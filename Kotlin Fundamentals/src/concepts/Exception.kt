package concepts

fun thuong(a:Int, b:Int): Int{
    if (b == 0)
        throw Exception("Mau = 0 ứ chia được")
    return a/b
}
class NegativeNumberException(message: String) : Exception(message)

fun checkNumber(num: Int) {
    if (num < 0) {
        throw NegativeNumberException("Lỗi: Không thể nhập số âm!")
    }
    println("Số hợp lệ: $num")
}

fun main(args: Array<String>) {
//    var a = 10
//    var b = 0
//    try {
//        var c = a / b
//        println(c)
//    } catch (e: Exception) {
//        e.printStackTrace()
//    } finally {
//        println("đoạn code muốn thực thi, kể cả khi c trình lỗi")
//    }

    // Loi
//    thuong(10,0)
//    println("Doan code phia sau")

    // Thanh cong
    try {
//        println(thuong(5, 0))
        var c = thuong(5,0)
        println(c)
    } catch (e: Exception) {
//        e.printStackTrace()
        println(e.message)
    } finally {
        println("đoạn code muốn thực thi, kể cả khi c trình lỗi")
    }

    try {
        checkNumber(-5)  // ❌ Ném ra ngoại lệ
    } catch (e: NegativeNumberException) {
        println(e.message)  // ✅ Xử lý lỗi
    }
}