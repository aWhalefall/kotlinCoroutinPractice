package simpleCoroutein

import kotlinx.coroutines.*


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

/*
fun main() = runBlocking { // this: CoroutineScope
    launch {
        doWorld()
    }
    println("Hello")
}

private suspend fun doWorld() {
    delay(1000)
    println("world!")
}*/

//sampleStart
// Sequentially executes doWorld followed by "Done"
fun main3() = runBlocking {
    doWorld()
    println("Done")
}

// Concurrently executes both sections
suspend fun doWorld() = coroutineScope { // this: CoroutineScope
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}


fun main4() = runBlocking {
//sampleStart
    val job = launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("World!")
    }
    println("Hello")
    job.join() // wait until child coroutine completes

    println("Done")
//sampleEnd
}

fun main() = runBlocking {
    repeat(100_000) { // 启动大量的协程
        launch {
            delay(5000L)
            print(".")
        }
    }
}