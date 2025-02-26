package oop_applying

// Đa hình là tại từng thời điểm đối tượng sẽ có các hình thái khác nhau trong những hoàn cảnh khác nhau.
open class Animal {
    open fun sound() {
        println("Animal makes a sound")
    }
}

class Dog : Animal() {
    override fun sound() {
        println("Dog barks")
    }
}

class MathUtils {
    fun add(a: Int, b: Int): Int = a + b
    fun add(a: Double, b: Double): Double = a + b
}

fun main(args: Array<String>) {
    // Basic
        // Overriding
    val animal: Animal = Dog()
    animal.sound()  // ✅ Output: Dog barks
        // Overloading
    val math = MathUtils()
    println(math.add(5, 10))       // ✅ Output: 15
    println(math.add(5.5, 2.3))    // ✅ Output: 7.8

    // 1. Đa hình từ kế thừa lớp: (Ex: Phó Phòng > thăng cấp Trưởng Phòng )
    var nv1: NhanSu = PhoPhong()
    println("Lương của ong nv1 là: " + nv1.TinhLuong(23))
        // Ông trường phòng tham nhũng, nên bị đuổi
            // Thăng cấp nv1 - tp
    nv1 = TruongPhong()
    println("Lượng của ông nv1 là: " + nv1.TinhLuong(23))

    // 2. Đa hình từ kế thừa interface
        // Khai báo đối tượng, kiểu dữ Liệu TinhToan
    var dt1: TinhToan = TinhCong()
        // Gọi phương thức tính
    dt1.tinh(7, 5)     // Tính cộng
        // Chuyển dt1 sang đối tượng TinhHieu
    dt1 = TinhHieu()
    dt1.tinh(7, 5)   // Tính hiệu

// Data Classes
    // Trong qua trình xử lý, đôi khi ta chi cần lưu trữ dữ lieu ma khong dung đen cac phương thức.
//          => Kotlin có hỗ trợ tạo một lớp đặc biệt, lớp này gọi là Data Class.
    // Các Data Class trong Kotlin sẽ tự động cung cấp:
    //      *   equals() / hashCode()
    //      *   toString()
    //      *   componentNO
    //      *   copy()

    data class TestData(var ten: String, var cccd: String)

    var data1 = TestData("Hứa thị lèo", "1234567")
    println(data1)
    // Test phương thức copy
    var data2 = data1.copy()
    println(data2)
    // Copy có sửa đổi dữ liệu
    var data3 = data1.copy(cccd = "9999")
    println(data3)
    // ComponentN(): để ánh xạ tới thuộc tính của đối tượng
    println(data3.component1())
    println(data3.component2())
}