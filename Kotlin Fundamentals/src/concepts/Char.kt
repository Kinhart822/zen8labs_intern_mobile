package concepts

fun main(args: Array<String>) {
    // Cach 1
    var kyTu: Char = 'a'

    // Cach 2 (Ma ASCII)
    var kyTu2: Char = Char(64)

    println(kyTu)
    println(kyTu2)

    // Ep kieu String thanh Char
    println("Mời nhập vào 1 ký tự: ")
    var s: String? = readLine()
    if (s == null)
        return
    var kt: Char = s.first()         //cách 1
    var kt2: Char = s[0]             //cách 2
    var kt3: Char = s.single()      //cách 3
    println(kt)
    println(kt2)
    println(kt3)
    println(kt::class.java.typeName)
    println(kt2::class.java.typeName)
    println(kt3::class.java.typeName)

//  So sanh ky tu
    // Cach 1: So sanh dua vao ma ASCII (compareTo)
        //1. ký tự giống nhau: trả về 0
    println('a'.compareTo('a'))
        //2. ký tự 1 < 2 => trả về âm
    println('a'.compareTo('b'))
        //3. ký tự 1 > 2 trả về dương
    println('b'.compareTo('a'))
    println('m'.compareTo('a'))

    // Cach 2: So sanh tra vef true or false (equals)
    println('a'.equals('a')) // true
    println('a'.equals('b')) // false

// Char methods
    println('1'.isDigit())        // true
    println('a'.isLetter())       // true
    println(' '.isWhitespace())   // true
    println('a'.isLowerCase())    // true
    println('A'.isUpperCase())    // true
}