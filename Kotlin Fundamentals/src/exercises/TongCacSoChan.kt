package exercises

fun main(args: Array<String>) {
    var tong:Int = 0
    println("Mời nhập vào số a: ")
    var a:Int? = readLine()?.toInt()
    if (a != null) {
        if (a % 2 == 0){
            for (i in 0..a step 2) {
                tong += i
            }
            println("Tong cac so chan trong khoang tu 1 den $a la: $tong")
        }
        else
            println("Ko tinh tong le")
    }

}