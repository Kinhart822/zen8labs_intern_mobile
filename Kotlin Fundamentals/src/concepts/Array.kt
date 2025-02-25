package concepts

import kotlin.random.Random

fun main(args: Array<String>) {

// Tạo mảng rong
    var M: IntArray = IntArray(5) //mång 5 pt là các số 0
    var M2: FloatArray = FloatArray(4) //màng 4 pt là các số 0
    println(M::class.java.typeName) // int[]
    println(M2::class.java.typeName) // float[]
    for (i in M)
        print("$i\t")
    println("\n------------------")
    for (i in M2)
        print("$i\t")
    println("\n------------------")

// Khai báo
    var M3: IntArray = intArrayOf(0, 2, -5, 1, 3)
    for (i in M3)
        print("$i\t")
    println("\n------------------")

// Khai báo tắt (kotlin tự nội suy)
    var M4 = intArrayOf(1, 2, 3, 4)
    for (i in M4)
        print("$i\t")
    println("\n------------------")
    var M5 = arrayOf("tuhoc", "kotlin", "python")
    for (i in M5)
        print("$i\t")

    // Kiểm tra kiểu của M3, M4, M5
    println(M3::class.java.typeName) // int[]
    println(M4::class.java.typeName) // int[]
    println(M5::class.java.typeName) // kotlin.Array<kotlin.String>

// Truy xuat va thay doi mang
    // Truy xuat ptu qua vi tri index
    var M6 = intArrayOf(9, 8, 7, 6, 5)
    println(M6[0]) //9
    println(M6[1]) //8
    println(M6[2]) //7

    // Thay đổi giá trị của mảng qua index
    M6[0] = 1
    M6[1] = 1
    M6[2] = 3
    println(M6[0]) //1
    println(M6[1]) //1
    println(M6[2]) //3

// Khởi tạo mảng ngẫu nhiên
    var rd = Random
    var M7: IntArray = IntArray(7)
    println(M7.indices) // trả về đoan 0 .. size-1
    //  Duyệt từng phần tử màng
    for (i in M7.indices) {
        //println(i)
        M7[i] = rd.nextInt(100)
    }

    // Xuất cách 1
    for (j in M7)
        print("$j\t")
    println("\n---------------------------")
    // Xuất cách 2
    for (j in M7.indices)
        print("${M7[j]}\t")

// Size
    println("\n---------------------------")
    println("So phan tu cua mang M7 la: " + M7.size)

// Phep gan mang
    // ** gán mảng mới = mảng đã tồn tại (tham chiếu cùng vùng nhớ)
    // Chú ý : khi thay đổi giá trị của 1 mảng, thì mảng còn lại cũng thay đổi. Do mảng là kiểu tham chiếu, nó sẽ tham chiếu đến 1 vùng nhớ.
    var M9 = arrayOf(12, 3, 4, 5)
    var M10 = M9
    M9[0] = 99
    println(M9[0])         // 99
    println(M10[0])        // 99

// Clone
    var M11 = arrayOf(1, 2, 3, 4, 5)
    var M12 = M11.clone()
    M11[0] = 99              // Thay đổi phần tử index 0 = 99
    println(M11[0])     // 99
    println(M12[0])     //1

// Reverse
    var M13 = intArrayOf(1, 2, 3, 4, 5)
    M13.reverse()
    println("Mảng đã đảo ngược:")
    for (j in M13)
        print("$j\t")

    println("\n---------------------------")

// Sort
    var M14 = intArrayOf(5, 3, 2, 4, 1)
    M14.sort()
    println("Mảng đã sắp xếp:")
    for (j in M14)
        print("$j\t")

    println("\n---------------------------")

    var M15 = intArrayOf(4, 8, 3, 6, 9)
    M15.sortDescending()
    println("Mảng đã sắp xếp:")
    for (j in M15)
        print("$j\t")

    println("\n---------------------------")

// Filter - Trich loc mang theo dieu kien => tra ve 1 ArrayList
    var M16 = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    var ds = M16.filter { x -> x != null }
    println(ds)  // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    println(ds::class.java.typeName)
    var ds1 = M16.filter { x -> x % 2 == 0 }
    println(ds1)  // [2, 4, 6, 8, 10]
    println(ds1::class.java.typeName)
    println("\n---------------------------")

//tim max min
    val arr2:Array<Int> = arrayOf(6, 3, 2, 5, 10)
    arr2.sort()
    println("Minimum: ${arr2.first()}")          // Minimum: 2
    println("Minimum: ${arr2[0]}")              // Minimum: 2
    println("Maximum: ${arr2.last()}")          // Maximum: 10
    println("Maximum: ${arr2[arr2.size - 1]}") // Maximum: 10

// Mang 2 chieu
        // Khai bao mang 2 chieu
    var M22:Array<IntArray> = Array(3,{ IntArray(4)})       // Mang 2 chiều 3 hàng 4 cột
        // Khai bao mang ngau nhien
    var rd1 = Random
    println(M.indices) // Chay chỉ số hàng 0 .. 2
    for (i in M22.indices) {
        for (j in M22[i].indices) {
            M22[i][j] = rd1.nextInt(51)
        }
    }
        // Xuat phan tu thu i, j
    println(M22[0][0])
    println(M22[0][1])
    println(M22[0][2])
    println("\n---------------------------")

        // Xuat mang
    for (i in M22.indices) {
        for (j in M22[i].indices) {
//            print("$i$j \t")
            print("${M22[i][j]}\t")
        }
        println()
    }

    // trong java Không hỗ trợ null nhưng kotlin lại co	Hỗ trợ - dùng Array<T?>
    val nullableArray: Array<Int?> = arrayOf(1, 2, null, 4, 5)
    println(nullableArray.joinToString()) // Output: 1, 2, null, 4, 5

    // Có thể thay đổi phần tử vì val chỉ cố định tham chiếu của mảng, không phải nội dung bên trong.
    //❌ Không thể gán lại mảng mới nếu khai báo bằng val
    val arr = arrayOf(1, 2, 3)
    arr[0] = 99 // Hợp lệ ✅
    println(arr.joinToString()) // Output: 99, 2, 3

        // arr = arrayOf(4, 5, 6) // ❌ Lỗi: Val cannot be reassigned

    //  Dùng constructor Array(size) { lambda }
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val squares = Array(5) { i -> (i + 1) * (i + 1) } // [1, 4, 9, 16, 25]
    println(numbers.joinToString()) // Output: 1, 2, 3, 4, 5
    println(squares.joinToString()) // Output: 1, 4, 9, 16, 25`
}
