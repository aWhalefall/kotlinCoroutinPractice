package unit3

import kotlinx.coroutines.delay
import kotlin.concurrent.thread
import kotlin.coroutines.*

/**
 * creat time 2021/12/19 下午4:40
 * author kuaidao
 * email : kuaidao2022@gmail.com
 * 如何判断一个函数是否会被挂起
 */

fun main() {
Cps().test2()
}

class Cps {

//
//    fun test(){
//        suspend {
//            println("run suspend coroutine")
//            //notSuspend()
//        }.startCoroutine(object :Continuation<Int>{
//            override val context: CoroutineContext
//                get() = EmptyCoroutineContext
//
//            override fun resumeWith(result: Result<Int>) {
//                thread {
//                    println("success")
//                }
//            }
//
//        })
//        println("synRunning")
//    }

    val ref=::notSuspend
    val resule=ref.call(object :Continuation<Int>{
        override val context: CoroutineContext
            get() = EmptyCoroutineContext

        override fun resumeWith(result: Result<Int>) {
           println("resumeWith : ${result.getOrNull()}")
        }

    })

   fun test2(){
     println(resule)
    }
}

suspend fun notSuspend()= suspendCoroutine<Int> { continuation ->
    continuation.resume(100)
}





