package simpleCoroutein

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking


//sampleStart
    fun main0() = runBlocking { // this: CoroutineScope
        launch {
            delay(1000)
            println("world!")
        }
      println("Hello")
    }
//sampleEnd

/**
协程遵循 结构化并发原则
限定协程生命周期的特定CoroutineScope 中启动
*/

fun main() = runBlocking { // this: CoroutineScope
    launch {
        doWorld()
    }
    println("Hello")
}

private suspend fun doWorld() {
    delay(1000)
    println("world!")
}