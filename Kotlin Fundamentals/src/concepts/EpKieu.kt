package concepts

fun main() {
// Ép kiểu rộng (Int->Long->Float->Double) => Ko lo mất dữ liệu
    var a: Int = 1000
    var b: Long = a.toLong()
    var c: Float = b.toFloat()
    var d: Double = c.toDouble()
    println("Kiểu loại của a: ${a::class.java.typeName}")
    println("Kiểu loại của b: ${b::class.java.typeName}")
    println("Kiểu loại của c: ${c::class.java.typeName}")
    println("Kiểu loại của d: ${d::class.java.typeName}")
    println("a: $a, b: $b, c: $c, d: $d")

// Ép kiểu hẹp (Double->Float->Long->Int) => Có thể mất dữ liệu
    var e: Double = 1000.0
    var f: Float = e.toFloat()
    var g: Long = f.toLong()
    var h: Int = g.toInt()
    println("Kiểu loại của e: ${e::class.java.typeName}")
    println("Kiểu loại của f: ${f::class.java.typeName}")
    println("Kiểu loại của g: ${g::class.java.typeName}")
    println("Kiểu loại của h: ${h::class.java.typeName}")
    println("e: $e, f: $f, g: $g, h: $h")

    var x:Short = 32767
    var y:Byte = x.toByte()
    println(x)
    println(y)              // Trả về -1 vì ko đủ sức chứa

    var diemToan:Float = 7.8f
    var diemLy:Int = diemToan.toInt()
    println(diemToan)       // Trả về 7.8
    println(diemLy)         // Trả về 7 (mất dữ liệu)

    var xy:Short = 120
    var yx:Byte = x.toByte()
    println(xy)
    println(yx)              // Trả về 120 vì Byte vẫn đủ sức chứa

    // String
    var a1:Boolean = "true".toBoolean()
    var a2:Byte="2".toByte()
    var a3:Short="20".toShort()
    var a4:Int="200".toInt()
    var a5:Long="2000".toLong()
    var a6:Float="200.5".toFloat()
    var a7:Double = "2000.33".toDouble()
}