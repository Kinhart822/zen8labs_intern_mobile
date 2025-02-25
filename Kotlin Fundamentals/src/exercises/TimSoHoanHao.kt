package exercises

fun main(args: Array<String>) {

// Viết chương trình cho phép người dùng nhập vào 1 số nguyên n,
    // tính và in ra tất cả các số nguyên tố của n, và đánh giá xem số này có phải là số hoàn hảo hay không.
    println("Mời nhập vào 1 số nguyên n :")
    var n:Int? = readLine()?.toInt()
    if  (n != null){
        var tong = 0
        for (i in 1 until n){
            if (n % i == 0){
                println(i)
                tong += i
            }
        }
        if (tong == n){
            println("$n là số hoàn hảo")
        } else {
            println("$n không phải là số hoàn hảo")
        }
    }

// Tính và in ra tất cả các số nguyên tố của từ 1 đến 1000
    for (n1 in 1 .. 1000){
        if  (n1 != null){
            var tong1 = 0
            for (i1 in 1 until n1){
                if (n1 % i1 == 0){
                    tong1 += i1
                }
            }
            if (tong1 == n1){
                println("$n1 là số hoàn hảo")
            }
        }
    }
}