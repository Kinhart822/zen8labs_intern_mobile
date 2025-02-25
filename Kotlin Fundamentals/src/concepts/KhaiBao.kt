package concepts

fun main() {
    // Khai báo biến kiểu tường minh
    var a: Int = 0
    println("Kiểu loại của a: ${a::class.simpleName}")
    var b: Double = 3.14
    println("Kiểu loại của b: ${b::class.java.typeName}")

    // Khai báo biến kiểu tắt
    var c = 0
    println("Kiểu loại của c: ${c::class.java.typeName}")
    var d = 3.14
    println("Kiểu loại của d: ${d::class.java.typeName}")

    // Kí tự
    var e: Char = 'a'
    println("Kiểu loại của e: ${e::class.java.typeName}")

    // Chuỗi ký tự
    var f: String = "Hello, World!"
    println("Kiểu loại của f: ${f::class.java.typeName}")

    // Khai báo đoạn
    var g = """
        |Hello,
        |World!
        |This is a multiline string.
    """
    println(g)

    // Khai báo boolean
    var h: Boolean = true
    var i: Boolean = false
    println("Kiểu loại của h: ${h::class.java.typeName}")
    println("Kiểu loại của i: ${i::class.java.typeName}")

    // Khai báo null
    var j = null
    println(j)

    // Khai báo mảng
    var k: FloatArray = floatArrayOf(0.1f, 0.3f, 0.4f, 0.5f)
    println("Kiểu loại của k: ${k::class.java.typeName}")
    println(k)
    println("!=")
    println(k.contentToString())

    var l: CharArray = charArrayOf('a','b','c','d')
    println("Kiểu loại của l: ${l::class.java.typeName}")
    println(l)
    println("!=")
    println(l.contentToString())

    var m: IntArray = intArrayOf(1,2,3,4,5)
    println("Kiểu loại của m: ${m::class.java.typeName}")
    println(m)
    println("!=")
    println(m.contentToString())

    // Hằng số
    val PI = 3.14
    println("PI: $PI")
    println("Pi: " + PI)
}