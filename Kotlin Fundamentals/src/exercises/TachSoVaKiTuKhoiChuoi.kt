package exercises

fun main(args: Array<String>) {
    var so = ""
    var chuoi = ""
    println("Mời nhập vào 1 chuỗi: ")
    var s: String? = readLine()
    if (s == null)
        return
    for (i in s) {
        if (i.isLetter())
            chuoi += i
        else if (i.isDigit())
            so += i
    }
    println("Chuỗi sau tách Là: " + chuoi)
    println("Chuỗi số sau tách Là: " + so)
}