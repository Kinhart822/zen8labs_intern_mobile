package exercises

fun main(args: Array<String>) {

// 0. Tạo list do người dùng nhập vào:
    println("Mời nhập vào số pt của list : ")
    var n: Int? = readLine()?.toInt()
    if (n == null)
        return
    var M: MutableList<Int> = mutableListOf()
    // Duyệt for để gán phần từ
    for (i in 1..n) {
        println("Mời nhập vào phần tử thứ $i của list: ")
        var inPut: Int? = readLine()?.toInt()
        if (inPut == null)
            return
        // Add phần tử vào list
        M.add(inPut)
        println("List M hiện tai : " + M)
    }
// 1. Tạo ra 1 list mới bình phương các phần từ của list cũ
    var M2:MutableList<Int> = mutableListOf()
    for (i in M)
        M2.add(i*i)
    println("Ds M2 Là: " + M2)

// 2. Xác đinh xem có bao nhiêu pt>50 trong M2
    var dem=0
    for (i in M2)
        if (i > 50)
            dem++
    println("Co $dem pt > 50 trong M2 ")

}