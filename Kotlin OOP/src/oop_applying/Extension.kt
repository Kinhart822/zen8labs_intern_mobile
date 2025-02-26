package oop_applying

import java.util.*

// Extensions Method cho phép ta chèn thêm phương thức vao cac Lớp có sẵn mà không cần phải chỉnh sửa Lớp, không cần kế thừa ....

// Chen ham Cong vao Int
fun Int.cong(a:Int):Int {
    return this + a
}

// Chem ham kiem tra so nguyen to vao Int
fun Int.isSoNguyenTo():Boolean {
    // Cach 1
//    if (this < 2) return false
//    for (i in 2..Math.sqrt(this.toDouble()).toInt()){
//        if (this % i == 0) return false
//    }
//    return true

    // Cach 2
    var dem = 0
    for (i in 1..this) {
        if (this % i == 0)
            dem++
    }
    return dem == 2
}

// Hàm tính tuổi,chèn vao class SV
fun SV.tuoi():Int {
    //  Khởi tạo đối tượng ngày tháng (bài 17)
    var cal = Calendar.getInstance()
    var namHienTai = cal.get(Calendar.YEAR)
    //  Set năm sinh gán vào biến time
    cal.time = this.NamSinh
    var yearNamSinh = cal.get(Calendar.YEAR)
    return namHienTai - yearNamSinh + 1
}

fun String.removeFirstLastChar(): String {
    return this.substring(1, this.length - 1)
}

val String.firstChar: Char
    get() = this[0]

fun String?.isNullOrEmpty(): Boolean {
    return this == null || this.isEmpty()
}

class Person1 {
    companion object {}
}

fun Person1.Companion.sayHello() {
    println("Hello from Companion Object!")
}

fun <T> List<T>.secondOrNull(): T? {
    return if (this.size >= 2) this[1] else null
}

fun main(args: Array<String>) {
    // Basic usage
    var x = 7.cong(5)
    println(x)

    var kq = 3.isSoNguyenTo()
    println(kq)

        // Test tính tuổi
    var ns = Calendar.getInstance()
            // Set năm sinh
    ns.set(Calendar.YEAR,1995)
    var Trang = SV(ns.time)
    var tuoiTrang = Trang.tuoi()
    println(tuoiTrang)

    val str = "Kotlin"
    println(str.removeFirstLastChar())  // Output: otli

    // Extension Property
    println(str.firstChar)  // Output: K

    // Nullable Extension
    val str1: String? = null
    println(str1.isNullOrEmpty())  // Output: true

    val str2: String? = ""
    println(str2.isNullOrEmpty())  // Output: true

    val str3: String? = "Kotlin"
    println(str3.isNullOrEmpty())  // Output: false

    // Companion Object Extension
    Person1.sayHello()  // Output: Hello from Companion Object!

    // Generic Extension
    val numbers = listOf(1, 2, 3)
    println(numbers.secondOrNull())  // Output: 2

    val letters = listOf("A")
    println(letters.secondOrNull())  // Output: null
}
