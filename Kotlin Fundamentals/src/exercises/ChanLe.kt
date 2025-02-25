package exercises

fun main(args: Array<String>){

// Nhập vào 1 số, kiểm tra chẵn, lẻ
    var a:Int?
    println("Mời cụ nhập vào 1 số nguyên: ")

// Ép kiểu nguyên cho dữ Liệu nhập vào
    a= readLine() ?. toInt()

// Kiểm tra nếu dữ liệu nhập vào là null
    if (a != null){
        if (a % 2 == 0)
            println("Số $a là số chẵn")
        else
            println("Số $a là số lẻ")
    }


}