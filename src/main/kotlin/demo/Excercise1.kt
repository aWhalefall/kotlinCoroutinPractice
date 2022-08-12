package demo

open class Animal {
    fun eat() {
        println("所有动物都会吃东西")
    }
}

class Mouse() : Animal() {

    fun sound() {
        println("老鼠乱叫")
    }
}

class Dog() : Animal() {
    fun sound() {
        println("狗乱吠")
    }
}
