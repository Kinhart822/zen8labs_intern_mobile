package exercises

fun main(args: Array<String>) {
    var a = "abcdefghijklmnopgrstuvwxyz"
    var b = "zxcvbnmasdfghjklgwertyuiop"
    var mahoa = ""
    println("Mời nhập vào chuỗi cần mã hóa: ")
    var s: String? = readLine()
    if (s == null) return
    for (i in s)
    //println(i)
    //println(a.indexOf(i))
    //println(b[a.indexOf(i)])
        mahoa += b[a.indexOf(i)]
    println("Chuoi sau ma hoa Là:" + mahoa)
}
