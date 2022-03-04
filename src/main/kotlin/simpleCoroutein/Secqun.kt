package simpleCoroutein

import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

class Secqun {
}

fun main6() = runBlocking<Unit> {
//sampleStart
    val time = measureTimeMillis {
       // println("The answer is ${one + two}")
//        val one = doSomethingUsefulOne()
//        val two = doSomethingUsefulTwo()
        val one = async { doSomethingUsefulOne() }
        val two = async { doSomethingUsefulTwo() }
        println("The answer is ${one} ${two}")
    }
    println("Completed in $time ms")
//sampleEnd
}
fun main() = runBlocking<Unit> {
//sampleStart
    val time = measureTimeMillis {
       // println("The answer is ${one + two}")
//        val one = doSomethingUsefulOne()
//        val two = doSomethingUsefulTwo()
        val one = async(start = CoroutineStart.DEFAULT) { doSomethingUsefulOne() }
        val two = async { doSomethingUsefulTwo() }

        println("The answer is ${two.await()} ${one.await()} ")
    }
    println("Completed in $time ms")
//sampleEnd
}

suspend fun doSomethingUsefulOne(): Int {
    delay(1000L) // 假设我们在这里做了些有用的事
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    delay(1000L) // 假设我们在这里也做了一些有用的事
    return 29
}