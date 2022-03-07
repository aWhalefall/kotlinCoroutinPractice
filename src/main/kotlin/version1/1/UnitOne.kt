package version1.`1`

import java.util.*

fun needAnswer() = Random().nextBoolean()

fun main1(args: Array<String>) {
//sampleStart  局部委托属性
    val answer by lazy {
        println("Calculating the answer...")
        42
    }
    if (needAnswer()) {                     // 返回随机值
        println("The answer is $answer.")   // 此时计算出答案
    }
    else {
        println("Sometimes no answer is the answer...")
    }
//sampleEnd
}

//sampleStart
enum class RGB { RED, GREEN, BLUE }

inline fun <reified T : Enum<T>> printAllValues() {
    println(enumValues<T>().joinToString { it.name })
}
//sampleEnd

fun main(args: Array<String>) {
   // 1 printAllValues<RGB>() // 输出 RED, GREEN, BLUE

    /*2//sampleStart
    val squares = List(10) { index -> index * index }
    val mutable = MutableList(10) { 0 }
//sampleEnd

    println("squares: $squares")
    println("mutable: $mutable")*/


   // map()

    //sampleStart
    val array = arrayOf("a", "b", "c")
    println(array.toString())  // JVM 实现：类型及哈希乱码
    println(array.contentToString())  // 良好格式化为列表
//sampleEnd
}

private fun map() {
    //sampleStart
    val map = mapOf("key" to 42)
    // 返回不可空 Int 值 42
    val value: Int = map.getValue("key")

    val mapWithDefault = map.withDefault { k -> k.length }
    // 返回 4
    val value2 = mapWithDefault.getValue("key2")

    // map.getValue("anotherKey") // <- 这将抛出 NoSuchElementException
//sampleEnd

    println("value is $value")
    println("value2 is $value2")
}