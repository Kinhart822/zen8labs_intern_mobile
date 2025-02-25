package concepts

// MutableList La collection co the thay đoi kich thước du lieu: Co the thêm, sửa, xóa ...
// List là collection chi co nhiem vụ readOnly, dùng đe hien thị thong tin.
    // Ưu điểm: List tối ưu bộ nhớ hơn so với MutableList. Do đó nếu chỉ để hiển thị thông tin thì nên dùng List.
fun main(args: Array<String>) {
        // Khai bao list
    // 1. Khai báo MutableList có thể thay đổi giá trị
    var ds1:MutableList<Int> = mutableListOf()
    println(ds1::class.java.typeName)

    // 2. Khai báo List (chỉ đọc, không thêm, sửa đc ... )
    var ds2:List<Int> = listOf(1, 2, 3)
    println(ds2::class.java.typeName)

        // Khoi tao danh sach co san 1 so phan tu
    // 1. khởi tạo list có thể thêm, sửa xóa được
    var ds3:MutableList<Int> = mutableListOf(1,2,3,4,5,6)
    println(ds3)    // [1, 2, 3, 4, 5, 6]

    // 2. khởi tạo list read only
    var ds4:List<Int> = listOf(2,4,6,8)
    println(ds4)    // [2, 4, 6, 8]

        // Duyet List
    var ds5:MutableList<Int> = mutableListOf(1,5,8,7)
    println(ds5.indices) //0 .. 3
    for(i in ds5.indices) // = i in 0 .. 3.
        print("${ds5[i]}\t")

    var ds6:MutableList<Int> = mutableListOf(1,5,8,7)
    println(ds6.indices) //0 .. 3
    for(i in ds6.indices) {
        // In ra phần tử chia hết cho 2 trong list
        if (ds6[i] % 2 == 0)
            println("số chia hết cho 2 là:" + ds6[i])
    }
        // Cac Phuong Thuc
    // 1. Them phan tu vao cuoi danh sach
    ds5.add(10)
    println(ds5) // [1, 5, 8, 7, 10]
    ds5.addAll(mutableListOf(2, 2, 2, 2))
    println(ds5) // [1, 5, 8, 7, 10, 2, 2, 2, 2]

    // 2. Them phan tu vao vi tri bat ky
    ds5.add(1, 15)
    println(ds5) // [1, 15, 5, 8, 7, 10]
    ds5.addAll(1, mutableListOf(10, 10, 10, 10))
    println(ds5)

    // 3. Xoa phan tu o vi tri bat ky
    ds5.removeAt(1)
    println(ds5)

    // 4. Xoa phan tu co gia tri bat ky
    ds5.remove(5)
    println(ds5)

    // 5. Sort
    ds5.sort()
    println(ds5)
    ds5.sortDescending()
    println(ds5)

    // 6. filter
    var ds7:MutableList<Int> = mutableListOf(1,2,3,4,5,6)
    println(ds7.filter { i -> i % 2 == 0 })

    // 7. Tim kiem phan tu
    println(ds5.contains(8)) // true

    // 8. Size
    println(ds5.size)

    // 9. Clear
    ds5.clear()
    println(ds5) // []

    // 10. isEmpty
    println(ds5.isEmpty())

    // 📌 listOfNotNull() – Tạo danh sách không chứa null
    val list = listOfNotNull("A", null, "B", null, "C")
    println(list)  // Output: [A, B, C]

    // 📌 emptyList<T>() – Tạo danh sách rỗng
    val empty: List<String> = emptyList()
    println(empty)  // Output: []

    // 📌 List(n) { init } – Tạo danh sách với kích thước cố định
    val squares = List(5) { it * it }
    println(squares)  // Output: [0, 1, 4, 9, 16]
}