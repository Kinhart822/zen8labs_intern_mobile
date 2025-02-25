package concepts

import java.util.*

// Đề nhập liệu từ bàn phím, Kotlin sử dụng hàm readLine():
        //· Trả về 1 chuỗi dữ liệu được nhập vào từ bàn phím
        //· Trả về null nếu không có dữ liệu
        //          ===> Từ chuỗi này, ta có thể ép kiểu chuỗi đó sang kiểu dữ liệu mong muốn

fun main(args: Array<String>){

// Nhập chuỗi từ bàn phím
    println("Nhập Tên:")
    var ten:String? = readLine()
    println("Tên là: $ten")

// Nhập số từ bàn phím
    println("Nhập vào một số nguyên:")
    val input = readLine()  // Đọc dữ liệu từ bàn phím
    // Kiểm tra xem dữ liệu đã nhập hay chưa
    if (input!= null) {
        // Nếu đã nhập dữ liệu, ép kiểu thành số nguyên
        val number = input.toInt()
        println("Số bạn vừa nhập là: $number")
    } else {
        println("Không nhập dữ liệu")
    }

    // Dấu ? trong Kotlin được sử dụng để đánh dấu một biến có thể chứa giá trị null.
// Đây là một phần của hệ thống kiểu dữ liệu an toàn của Kotlin, giúp tránh lỗi NullPointerException khi làm việc với giá trị null

// Cách khác: dùng Scanner class (phải import Scanner)
    // create an object for scanner class
    val number1 = Scanner(System.`in`)
    print("Enter an integer: ")
    // nextInt() method is used to take the next integer value and store in enteredNumber1 variable
    var enteredNumber1:Int = number1.nextInt()
    println("You entered: $enteredNumber1")

    val number2 = Scanner(System.`in`)
    print("Enter a float value: ")

    // nextFloat() method is used to take next Float value and store in enteredNumber2 variable
    var enteredNumber2:Float = number2.nextFloat()
    println("You entered: $enteredNumber2")

    val booleanValue = Scanner(System.`in`)
    print("Enter a boolean: ")
    // nextBoolean() method is used to take the next boolean value and store in enteredBoolean variable
    var enteredBoolean:Boolean = booleanValue.nextBoolean()
    println("You entered: $enteredBoolean")
}