    package concepts

fun main(args: Array<String>){
    var i =7

// Kiem tra xem i > 0 va i < 10 ?
    // Cach 1
    println(i > 0 && i < 10)
    // Cach 2
    println((i > 0).and(i < 10))

// Kiem tra xem i > 0 hoac i < 10 ?
    // Cach 1
    println(i > 0 || i < 10)
    // Cach 2
    println((i > 0).or(i < 10))

// Phu dinh
    // Cach 1
    println(!(i > 0 || i < 10))
    // Cach 2
    println((i > 0 || i < 10).not())

}
