package exercises

fun main(args: Array<String>) {
    var nam: Int =1
    var s:String?
    println("Mời nhập vào 1 năm: ")
    s= readLine()
    if (s != null)
        nam = s.toInt()
    println("năm bạn vừa nhập Là: $nam")
    if (((nam % 4 == 0) && (nam % 100 != 0)) || ( nam % 400 == 0))
        println("Năm $nam Là năm nhuận ")
    else
        println("Năm $nam không phải Là năm nhuận")
}