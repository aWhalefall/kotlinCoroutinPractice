package launchasyn

import kotlinx.coroutines.*
import simpleCoroutein.doSomethingUsefulTwo
import kotlin.system.measureTimeMillis
import kotlin.time.Duration

//fun main(args: Array<String>)= runBlocking<Unit> {
//   val one= async { // launch new coroutine in background and continue
//        delay(1000L) // non-blocking delay for 1 second (default time unit is ms)
//        println("World!") // print after delay
//        throw java.lang.RuntimeException("")
//    }
//    println("Hello, ${one.onAwait}") // main thread continues while coroutine is delayed
//    Thread.sleep(2000L) // block main thread for 2 seconds to keep JVM alive
//
//    println("end")
//}

//fun main(args: Array<String>) = runBlocking<Unit> {
//    val job = launch { // launch new coroutine and keep a reference to its Job
//        delay(1000L)
//        println("World!")
//    }
//    job.join() // wait until child coroutine completes
//    println("Hello,")
//}

fun main(args: Array<String>) = runBlocking<Unit> {

    try {
        val one = async {
            //delay(Duration.INFINITE)
            doSomethingUsefulOne()
        }
        val aa= one.await()
        println(aa.toString())
        println(one.getCompletionExceptionOrNull())
    } catch (e: Exception) {
        println("异常：$e")
    }



}

suspend fun doSomethingUsefulOne(): Int {
    return 13
}