package exercises

fun main(args: Array<String>) {
    var a = """
    tôi chăm học
    tôi chiu khó
    tôi đẹp zai tôi tôi
    """
    var dem = 0
    val lst = a.split(" ") // split by newline character
    for (i in lst) {
        println(i)
        if (i.contains("tôi"))
            dem++
    }
    println("Có $dem từ tôi trong chuỗi a")
}
