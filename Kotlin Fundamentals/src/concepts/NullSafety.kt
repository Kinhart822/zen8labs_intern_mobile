package concepts

fun main() {
    // 1. Non-nullable
    var name: String = "Kotlin"
        // name = null  ❌ Lỗi: Null cannot be a value of a non-null type String

    // 2. Nullable
    var name1: String? = "Kotlin"
    name1 = null  // ✅ Hợp lệ vì name là nullable

    // 3. Safe Call (?.)
    var name2: String? = "Kotlin"
    println(name2?.length)  // ✅ Output: 6

    name2 = null
    println(name?.length)  // ✅ Output: null (Không lỗi NPE)

    // 4. Elvis Operator (?:)
    var name3: String? = null
    val length = name3?.length ?: 0  // ✅ Nếu name là null, trả về 0
    println(length)  // Output: 0

    // 5. Non-null Assertion (!!)
    var name4: String? = "Kotlin"
    println(name4!!.length)  // ✅ Output: 6
    name4 = null
    // println(name!!.length)  ❌ Lỗi: NullPointerException

    // 6. Safe Cast (as?)
    val obj: Any = "Kotlin"
    val str: String? = obj as? String  // ✅ Chuyển kiểu an toàn
    println(str?.length)  // Output: 6
    //  📌 Nếu không thể chuyển kiểu, sẽ trả về null thay vì gây lỗi.

    // 7. Let (let)
    var name5: String? = "Kotlin"

    name5?.let {
        println("Độ dài của chuỗi: ${it.length}") // ✅ Output: 6
    }

    name5 = null
    name5?.let {
        println("Sẽ không in dòng này") // ❌ Không chạy vì name = null
    }

    // 8.  Null Safety với Collection
        // 🔹 Nullable Collection (List<T>?)
    var list: List<String>? = listOf("Kotlin", "Java")

    println(list?.size)  // ✅ Output: 2

    list = null
    println(list?.size)  // ✅ Output: null

        // 🔹 Collection với Nullable Elements (List<T?>)
    val list1: List<String?> = listOf("Kotlin", null, "Java")

    for (item in list1) {
        println(item?.length ?: "Phần tử null") // ✅ Tránh lỗi NPE
    }
            // Output:
            // 6
            // Phần tử null
            // 4

        // 🔹 Loại bỏ null trong danh sách (filterNotNull)
    val list2: List<String?> = listOf("Kotlin", null, "Java")
    val filteredList: List<String> = list2.filterNotNull()

    println(filteredList)  // ✅ Output: [Kotlin, Java]




}