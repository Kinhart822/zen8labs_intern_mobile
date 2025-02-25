package exercises

fun main(args: Array<String>) {
    var tonq: Float = 0.0f;
    var hieu: Float = 0.0f;
    var s: String?
    println("Mời nhập vào tổng 2 số: ")
    s = readLine()
    if (s != null)
        tonq = s.toFloat()

    println("Mời nhập vào hiệu 2 số: ")
    s = readLine()
    if (s != null)
        hieu = s.toFloat()

    println("Tổng bạn vừa nhập là: $tonq")
    println("Hiệu bạn vừa nhập là: $hieu")

    var x = (tonq+hieu)/2
    var y = tonq -x
    println("x = $x")
    println("y = $y")
}