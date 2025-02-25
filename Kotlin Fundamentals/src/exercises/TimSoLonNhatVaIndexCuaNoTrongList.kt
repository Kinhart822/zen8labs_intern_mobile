package exercises

fun main(args: Array<String>) {
    var M: MutableList<Int> = mutableListOf(1, 2, 5, 1, 2, 4, 8, 7, 8, 10, 10)
    println("danh sách M= " + M)
// tạo 1 list clone
    var M2 = M.toMutableList()  // != voi var M2 = M (se lay cung 1 o nho)
    // M2.remove(1)
    M2.sort()
    println("Danh sách sau khi sắp xếp M2 = " + M2)
    var min = M2[0]
    var max = M2[M2.size - 1]
    println("M2 = " + M2)
    while (M2.contains(min))
        M2.remove(min)
    while (M2.contains(max))
        M2.remove(max)
    println("Danh sách M2 sau khi xóa max min : " + M2)

    println("Giá trị nhỏ thứ 2 trong List M là: " + M2[0])
    print("Vi tri index = ")
    for (i in M.indices) {
        if (M[i] == M2[0])
            print("$i\t")
    }
    println()
    println("Giá trị lớn thứ 2 trong list M là: " + M2[M2.size - 1])
    print("Vi tri index = ")
    for (i in M.indices) {
        if (M[i] == M2[M2.size - 1])
            print("$i\t")
    }
    println()

}