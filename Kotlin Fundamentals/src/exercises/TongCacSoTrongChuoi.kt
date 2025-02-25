package exercises

fun main(args: Array<String>) {
    var str1:String = "English = 78 Science = 83 Math = 68 History = 65"
// Tách theo space
    var tach = str1.split(" ")
// Xuất kết quả
    var dem = 0
    var tong = 0
// Duyệt thử tách
    for (i in tach) {
        // Xuất thử
        // println(i)
        // println(i[0])
        if(i[0].isDigit() == true) {
            println(i)
            tong += i.toInt()
            dem++
        }
    }
    println("So luong diem: " + dem)
    println("Tong: " + tong)
}
