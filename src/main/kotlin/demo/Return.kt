package demo

import kotlin.jvm.JvmStatic

object Return {
    @JvmStatic
    fun main(args: Array<String>) {
        val test = test(3, 5)
        println(test)
    }

    fun test(x: Int, y: Int): Int {
        var result = x
        return try {
            result = x + y
            result
        } finally {
            result = x - y
        }
    }
}

/**
 * 正方体
 * 接口形式
 */

interface Cube {
    var with: Int
    var height: Int
}

/**
 * 正方形
 */
class Square : Cube {
    override var with: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var height: Int
        get() = TODO("Not yet implemented")
        set(value) {}

}
//抽象类方式

abstract class AbstractCube() {
    abstract var with: Int
    abstract var height: Int
}

class Square1 : AbstractCube() {

    override var with: Int
        get() = TODO("Not yet implemented")
        set(value) {}
    override var height: Int
        get() = TODO("Not yet implemented")
        set(value) {}

}


