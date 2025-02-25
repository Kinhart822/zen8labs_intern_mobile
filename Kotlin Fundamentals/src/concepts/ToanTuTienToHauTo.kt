package concepts

fun main(args: Array<String>){
    var x = 99
    var y = 10
    var z = 77
    var t = 88

// Hậu tố - Postfix
    x++
    y--
    println("x: " + x)      // Tra ve 100
    println("y: " + y)      // Tra ve 9

//  Tiền tố - Prefix
    ++z
    --t
    println("z: " + z)      // Tra ve 78
    println("t: " + t)      // Tra ve 87

// ===> Phép tính đơn lẻ, viết ++ và -- trc hay sau đều đc ( khác với java
//                  int result = x++; // result = 99, x = 100
//                  int result = ++x; // result = 100, x = 100
//      )

    var a = 10
    var b:Int = a.inc()
    var c:Int = a.dec()
    println("a: " + a)      // Tra ve 10
    println("b: " + b)      // Tra ve 11
    println("c: " + c)      // Tra ve 9

// ===> Chủ ý : Hàm inc() và dec() không thay đổi giá trị nội tại của biến, mà phải lưu sang 1 biến khác

    var d = 1
    var e = 2
    var k = d++ - ++e + 1    // Phép tính sai: 2-3+1=0
    //  Step 1 . Prefix
    //  Step 2. Các phép toán còn lại
    //  Step 3. Gán giá trị cho biến ở bên trái dấu bằng
    //  Step 4. Tinh postfix
    println(k)  // Tra ve -1
    println(d)  // Tra ve 2
        //  Step 1: ++y => y = 3
        //  Step 2: x=1,y = 3 => 1-3+1 =-1
        //  Step 3: z =-1
        //  Step 4: x++ => x = 2

}

