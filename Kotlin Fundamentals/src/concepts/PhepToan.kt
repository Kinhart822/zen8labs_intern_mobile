package concepts

import kotlin.math.*

fun main(args: Array<String>){
    var a = 3   // Khai báo tắt tự động nhận kiểu int
    var b = 15 // Khai báo tắt tự động nhận kiểu int

    println("\"Kiểu loại của a: ${a::class.java.typeName}")
    println("\"Kiểu loại của b: ${b::class.java.typeName}")

    //  Phép cộng
    println("cách 1: a + b = " + (a+b))
    println("cách 2: a + b = ${a + b}")
    println("cách 3: a + b = ${a.plus(b)}")
    println("cách 4: a + b = " + (a.plus(b)))

    //  Phép trừ
    println("cách 1: a - b = " + (a-b))
    println("cách 2: a - b = ${a - b}")
    println("cách 3: a - b = ${a.minus(b)}")
    println("cách 4: a - b = " + (a.minus(b)))

    //  Phép nhân
    println("cách 1: a * b = " + (a*b))
    println("cách 2: a * b = ${a * b}")
    println("cách 3: a * b = ${a.times(b)}")
    println("cách 4: a * b = " + (a.times(b)))

    //  Phép chia
    println("cách 1: a / b = " + (a/b))
    println("cách 2: a / b = ${a/b}")
    println("cách 3: a / b = ${a.div(b)}")
    println("cách 4: a / b = " + (a.div(b)))  // Nếu b = 0 thì sẽ báo lại ArithmeticException

    var kq:Float = a.toFloat()/b
//    var kq:Float = a/b.toFloat()
    println("cách 5: a / b = $kq")  // Chuyển kết quả thành kiểu Float

    //  Chia lấy dư
    println("cách 1: a % b = " + (a%b))
    println("cách 2: a % b = ${a%b}")
    println("cách 3: a % b = ${a.rem(b)}")
    println("cách 4: a % b = " + (a.rem(b)))  // Nếu b = 0 thì sẽ báo lại ArithmeticException

// Toán tử tiền tố 1 ngôi
    var x:Float = 9.2f
    // Trừ 1 ngôi (đảo dấu)
    var y = x.unaryMinus()  // Thêm dấu trừ
    println("y = " + y)   // -9.2

    // Cộng 1 ngôi
    var z = x.unaryPlus()  // Thêm dấu cộng
    println("z = " + z)   // 9.2

    // Lấy đúng giá trị tuyệt đối
    var w:Float = y.absoluteValue  // Thêm dấu abs
    println("w = " + w)   // 9.2

    // Mũ (Power)
    var p = 2.0
    var q = 3.0
    var r = p.pow(q)  // Thêm dấu pow
    println("r = " + r)   // 8.0

    // Logarit
    var s = 2.71828
    var t = 3.0
    var u = log(t, s)  // Thêm dấu log
    println("u = " + u)   // 1.0986122886681098

    // Sin
    var v = 30.0
    var wb = sin(Math.toRadians(v))  // Thêm dấu sin
    println("w = " + wb)

    // Cos
    var k = 30.0
    var L = cos(Math.toRadians(k))  // Thêm dấu cos
    println("L = " + L)

    // Làm tròn lên
    var m = 4.7
    var n = ceil(m)
    println("n = " + n)

    // Làm tròn xuống
    var o = 4.7
    var pd = floor(o)  // Thêm dấu floor
    println("pd = " + pd)
    
}