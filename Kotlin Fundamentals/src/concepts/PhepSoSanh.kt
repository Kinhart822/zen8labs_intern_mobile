package concepts

fun main(args: Array<String>){
    var soA = 3
    var soB = 5

    // So sánh: Cách 1
    println(soA == soB)
    println(soA != soB)
    println(soA > soB)
    println(soA < soB)
    println(soA >= soB)
    println(soA <= soB)

    // So sánh: Cách 2
    println("---------------")
    println(soA.equals(soB))
    println(!soA.equals(soB))
    println(soA.compareTo(soB) > 0)
    println(soA.compareTo(soB) < 0)
    println(soA.compareTo(soB) >= 0)
    println(soA.compareTo(soB) <= 0)
    println(soA.compareTo(soB))         // Trả về -1


}