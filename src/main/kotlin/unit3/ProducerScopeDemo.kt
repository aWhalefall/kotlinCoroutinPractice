package unit3

import kotlinx.coroutines.delay
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

/**
 * creat time 2021/12/16 下午8:07
 * author kuaidao
 * email : kuaidao2022@gmail.com
 *
 *
 */


fun main() {
    callLaunchCoroutine()
}

//作用域应对，两个参数的携程创建、开始
class ProducerScope<T> {
    suspend fun produce(value:T){
        println("run meathod produce(${value})")
    }

}

fun  callLaunchCoroutine(){
   launchCoroutine(ProducerScope<Int>()){
        println("in corountine")
       produce(1024)
       delay(1000)
       produce(2048)

    }
}

fun <R,T> launchCoroutine(receiver: R,block:suspend R.() ->T){
    block.startCoroutine(receiver, object : Continuation<T> {
        override val context: CoroutineContext
            get() = EmptyCoroutineContext

        override fun resumeWith(result: Result<T>) {
            println("Corountine End: $result")
        }

    })
}
//无法直接声明带泛型的表达式
//val lambd=(receiver:R)->T

//val lambd= block:R()->T

//<R,T> 的含义

