package oop_introduction

interface Logger {
    fun log(message: String)
}

class CompanionObject {
    companion object {
        const val CONSTANT_VALUE = 100

        fun myFunction() {
            println("This is a function in companion object.")
        }
    }

    // Chú y chỉ có thể 1 companion object tương ứng vs mỗi class
//    companion object : Logger {
//        override fun log(message: String) {
//            println("LOG: $message")
//        }
//    }

}

fun main() {
    println(CompanionObject.CONSTANT_VALUE) // Truy cập constant
    CompanionObject.myFunction() // Gọi phương thức

//    CompanionObject.log("Companion Object triển khai Interface!")
}
