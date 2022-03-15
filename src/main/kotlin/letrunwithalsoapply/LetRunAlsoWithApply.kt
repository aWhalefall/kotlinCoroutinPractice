package letrunwithalsoapply

import java.util.function.Function
import kotlin.jvm.functions.FunctionN

class Sample() {


    fun sample1() {
        println("sample1")
    }

    fun sample2() {
        println("sample2")
    }

    fun sample3() {
        println("sample3")
    }


}

fun main() {
    //变量lambda 表达式
    val params = { x: Int, y: Int -> x + y }
    //调用表达式
    run { println(params(1, 3)) }
}

fun main1() {

    val str = 123
//①    val combinStr=str.let { "$str world" }
//②   val combinStr= with(str) {
//        "$str world"
//    }
//③ val combinStr=str.run { "$str world " }

//④    val combinStr=str.apply { "$str world" }

//⑤    val combinStr=str.also { "$str world" }
    // println(combinStr)

}

//泛型 T/R, [入参T返回 R]
//① fun <T, R> T.let(block: (T) -> R): R = block(this)
//② fun <T, R> with(receiver: T, block: T.() -> R): R = receiver.block()
//③ fun <T, R> T.run(block: T.() -> R): R = block()
//④ fun T.apply(block: T.() -> Unit): T { block(); return this }
//⑤ fun T.also(block: (T) -> Unit): T { block(this); return this }