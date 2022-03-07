package version1.`1`

import kotlin.reflect.typeOf

class UnitSix {

}

inline fun <reified T>renderType(): String {
    val type = typeOf<T>()
    return type.toString()
}

fun main() {
    val fromExplicitType = typeOf<Int>()
    val fromReifiedType = renderType<List<Int>>()

    println("$fromExplicitType")
    println("$fromReifiedType")
}