package oop_applying

// Kế thừa - Inheritance: Tạo ra các lớp con, để tái sữ dụng lại những thành phần của lớp cha đã có
//    Ưu điểm : Giúp code ngắn gọn, không cần phải viết lại những code mà lớp cha đã có
//                  => Thuận tiện trong quản lý, dễ sữa đổi theo từng khối

open class Vehicle(val name: String) {
    fun start() {
        println("$name is starting")
    }
}

class Car(name: String, val brand: String) : Vehicle(name) {
    fun honk() {
        println("$brand $name is honking!")
    }
}

fun main() {
    // Basic
    val car = Car("Sedan", "Toyota")
    car.start()  // ✅ Output: Sedan is starting
    car.honk()   // ✅ Output: Toyota Sedan is honking!

    // Apply
    var ca1 = NhanVienDiCa("Nguyễn văn ca ","123456","Đà nẵng")
    var hc1 = NhanVienHanhChinh("Nguyễn văn hành","66666","Yên Bái")
    println("Lương nhân viên ca1 : " + ca1.TinhLuong())
    println("Lương nhân viên hc1 : " + hc1.TinhLuong())
}

