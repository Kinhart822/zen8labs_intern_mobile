package exercises

fun main(args: Array<String>) {

    // Cach 1
    var gt: Int =1
    var n:Int =4
    for (i in 1  ..  n) {
        gt *= i
    }
    println("$n! = " +gt)

    // Cach 2
    var gt1 = 1
    println("Mời nhập vào số nguyên n: ")
    var n1:Int? = readLine() ?. toInt()
    if (n1 != null){
        for (i in 1 .. n1)
            gt1 *= i // gt = gt*i
    }
    println("$n1! = $gt1")

    // Cach 3
    var gt2 = 1
    var i1 = 1
    println("Mời nhập vào số nguyên n: ")
    var n2:Int? = readLine() ?. toInt()
    if (n2 != null){
        while (i1 <= n2){
            gt2 *= i1 // gt = gt*i
            i1++ // i++
        }
    }
    println("$n2! = $gt2")
}