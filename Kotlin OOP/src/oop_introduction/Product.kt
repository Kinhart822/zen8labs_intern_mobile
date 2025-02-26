package oop_introduction

// Secondary Constructor:
//      * Secondary Constructors are placed within the class body
//      * Multiple secondary constructors can exist in the same class
//      * Constructors can have or not have parameters

class Product {
    constructor() {
        println("This is a secondary constructor without parameters")
    }

    constructor(ma: Int, ten: String, donGia: Int) {
        println("This is a secondary constructor with three parameters")
        println("$ma - $ten - $donGia")
    }
}