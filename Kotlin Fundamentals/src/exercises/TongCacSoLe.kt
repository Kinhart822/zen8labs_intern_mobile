package exercises

fun main(args: Array<String>) {
    var tong:Int = 0
    for (i in 1..9 step 2) {
        println(i)
        tong += i
    }
    println("Tong cac so le trong khoang tu 1 den 9 la: $tong")
}