package unit3

import kotlin.coroutines.*

fun main(){
    val demo= Demo()
    demo.startCoroutineRun()
}

class Demo {
    fun test(){
        print("helloworld")
    }
    //测试创建携程
    fun test2(){
     creatContinuation()
    }

    fun startCoroutineRun(){
        println("startCoroutine")
       startContinuation()
    }


}

fun creatContinuation() {
    val continuation = suspend {
        println("in Coroutine.")
        5
    }.createCoroutine(object : Continuation<Int> {
        override val context: CoroutineContext
            get() = EmptyCoroutineContext

        override fun resumeWith(result: Result<Int>) {
            println("Not yet implemented")
        }
    }).resume(Unit)
}
fun startContinuation() {
    val continuation = suspend {
        println("in Coroutine.")
        5
    }.startCoroutine(object : Continuation<Int> {
        override val context: CoroutineContext
            get() = EmptyCoroutineContext

        override fun resumeWith(result: Result<Int>) {
            println("Not yet implemented")
        }
    })
}