package exercises

fun main(args: Array<String>) {
    var thang: Int? = null
    var nam: Int? = null

    var s: String?
    println("Mời nhập vào tháng: ")
    s = readLine()
    if (s != null)
        thang = s.toInt()

    if (thang != null) {
        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12)
            println("Tháng $thang có 31 ngày")
        else if (thang == 4 || thang == 6 || thang == 9 || thang == 11)
            println("Tháng $thang có 30 ngày")
        else if (thang == 2) {
            println("Mời nhập vào 1 năm: ")
            s = readLine()
            if (s != null)
                nam = s.toInt()

            if (nam != null && (((nam % 4 == 0) && (nam % 100 != 0)) || (nam % 400 == 0)))
                println("Tháng $thang/$nam có 29 ngày")
            else
                println("Tháng $thang/$nam có 28 ngày")
        } else
            println("Tháng $thang không tồn tại")
    }
}