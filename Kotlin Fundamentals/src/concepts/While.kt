package concepts

fun main(args: Array<String>) {
    var i = 0;
    while (i <= 5) {
        println("i = $i")
        i++
    }
    println("thoát while i = $i")

    var n = 0
    while (n < 1 || n > 99) {
        println("mời nhập vào số nguyên n từ 1-99: ")
        var s: String? = readLine()
        if (s != null)
            n = s.toInt()
    }
    println("bạn nhập hợp lệ, n= $n")

// do-while
    //tính tổng các số từ 1 đến 5
    var h = 1
    var tonq = 0
    do {
        tonq += h // tong = tong+i
        h++
    } while (h <= 5)
    println("tổng từ 1-5 là: " + tonq)

// while(true) - vong lap vinh cuu -> dung lenh break de thoat vong lap
    var j = 0
    while (true) {
        println("j = $j")
        j++
        if (j == 5) break
    }

    while (true){
        println("Bạn muốn tiếp tục? (y để tiếp tục)")
        var s:String? = readLine()
        if (s!= "y" && s!= "Y")
            break
        println("Đang chơi game")
    }
    println("Đã đăng xuất")

// Continue
        //tính tổng từ 1 - 5 ( nhưng bỏ qua số 3)
    var tonq1: Int =0
    for (i in 1  ..  5){
        if (i == 3)
            continue // nếu i=3 thi bo qua
        else
            println("i = " +i)
            tonq1 += i
    }
        println("tổng = $tonq1")
}