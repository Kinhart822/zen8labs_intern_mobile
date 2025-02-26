package oop_applying

class Person {
    private var age: Int = 0  // Không thể truy cập trực tiếp từ bên ngoài

    fun setAge(value: Int) {
        if (value > 0) age = value  // Chỉ cho phép giá trị hợp lệ
    }

    fun getAge(): Int {
        return age
    }
}

fun main() {
    val person = Person()
    person.setAge(25)
    println("Tuổi của người dùng: ${person.getAge()}")  // Output: Tuổi của người dùng: 25
}