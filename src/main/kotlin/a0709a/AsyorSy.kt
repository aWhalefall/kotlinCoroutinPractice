package a0709a

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import unit3.test
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

/**
 * creat time 2022/7/9 下午2:23
 * author kuaidao
 * email : kuaidao2022@gmail.com
 *  协程体中suspend 函数之间顺序执行
 */
fun main() {
  startContinuation()
}

fun startContinuation() {
    suspend {
        println("test")
        thread()
        thread2()
        println("外层")
        2
    }.startCoroutine(object : Continuation<Int> {
        override val context: CoroutineContext
            get() = EmptyCoroutineContext
        override fun resumeWith(result: Result<Int>) {
            println("Not yet implemented")
        }
    })
}


suspend fun thread() {
    delay(2000)
    println("线程 1${Thread.currentThread().name}")
    print("12222222")
}

suspend fun thread2() {
    println("线程 2${Thread.currentThread().name}")
}

