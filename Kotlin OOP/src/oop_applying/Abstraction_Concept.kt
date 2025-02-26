package oop_applying

abstract class ConVat  {
    abstract fun sound()
}

class Cat : ConVat() {
    override fun sound() {
        println("Cat meows")
    }
}

interface Flyable {
    fun fly()
}

class Bird : Flyable {
    override fun fly() {
        println("Bird is flying")
    }
}

fun main() {
    // Abstract class
    val cat = Cat()
    cat.sound()  // ✅ Output: Cat meows

    // Interface
    val bird = Bird()
    bird.fly()  // ✅ Output: Bird is flying
}