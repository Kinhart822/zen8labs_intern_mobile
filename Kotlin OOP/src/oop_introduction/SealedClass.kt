package oop_introduction

// 1. Basic implementation
sealed class A {
    class B : A()
    class C : A() {
        class E : A() //this works.
    }

    init {
        println("Sealed class A")
    }
}

class D : A() //this works
{
    class F : A() //This won't work. Since sealed class is defined in another scope.
}

// 2. Sealed class constructors
sealed class AA(var name: String) {

    class B : AA("B")

    class C : AA("C")
}

class DD : AA("D")

// 3. Data class and object in sealed class
sealed class AAA {

    class B : AAA()

    class C : AAA()

    object D : AAA() {
        fun name() {
            println("Object D")
        }
    }

    data class E(var name: String) : AAA()
}

// 4. Sealed classes and when
sealed class Shape {
    class Circle(var radius: Float) : Shape()
    class Square(var length: Int) : Shape()
    class Rectangle(var length: Int, var breadth: Int) : Shape()
}

fun eval(e: Shape) =
    when (e) {
        is Shape.Circle -> println("Circle area is ${3.14 * e.radius * e.radius}")
        is Shape.Square -> println("Square area is ${e.length * e.length}")
        is Shape.Rectangle -> println("Rectangle area is ${e.length * e.breadth}")
    }

fun main() {
    // 1
    A.B()
    A.C()
    D()

    // 2
    var b = AA.B()
    var c = AA.C()
    var d = DD()
    println(b.name)
    println(c.name)
    println(d.name)

    // 3
    val e = AAA.E("Anupam")
    println(e) //prints E(name=Anupam)

    var dd = AAA.D
    dd.name() //prints Object D

    // 4
    var circle = Shape.Circle(4.5f)
    var square = Shape.Square(4)
    var rectangle = Shape.Rectangle(4, 5)

    eval(circle)       //Circle area is 63.585
    eval(square)       //Square area is 16
    eval(rectangle)    //Rectangle area is 20
}