package oop_introduction

//  Data class phải thỏa mãn các điều kiện sau:
    //  Phải có ít nhất một thuộc tính trong constructor
    //  Các thuộc tính phải là val hoặc var
    //  Không thể kế thừa class khác (nhưng có thể implement interface)

data class User(val name: String, val age: Int)

interface Printable {
    fun print()
}

data class ProductDescription(val name: String, val price: Double) : Printable {
    override fun print() {
        println("Product(name=$name, price=$price)")
    }
}

fun main() {
    val user1 = User("Alice", 25)
    val user2 = User("Alice", 25)

    // toString()
    println(user1)  // ✅ Output: User(name=Alice, age=25)

    // equals()
    println(user1.equals(user2))  // C1: ✅ true
    println(user1 == user2)  // C2: ✅ true

    // copy()
    val user3 = user1.copy(age = 30)
    println(user3)  // ✅ Output: User(name=Alice, age=30)

    // Data Class với Destructuring Declaration
    val user = User("Bob", 28)
    val (name, age) = user

    println(name)  // ✅ Bob
    println(age)   // ✅ 28

    // Data Class với Interface
    val product = ProductDescription("Laptop", 999.99)
    product.print()  // ✅ Output: Product(name=Laptop, price=999.99)
}