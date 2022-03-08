package simpleCoroutein

import kotlinx.coroutines.*

class CoroutineContextSample {
}

fun main()= runBlocking<Unit> {
    println("currentThread =${Thread.currentThread().name}")

    launch { // 运行在父协程的上下文中，即 runBlocking 主协程
        println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Unconfined) { // 不受限的——将工作在主线程中
        println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
        upconfined()
        println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(Dispatchers.Default) { // 将会获取默认调度器
        println("Default               : I'm working in thread ${Thread.currentThread().name}")
    }

    launch(Dispatchers.IO) { // 不受限的——将工作在主线程中
        println("Io            : I'm working in thread ${Thread.currentThread().name}")
    }
    launch(newSingleThreadContext("MyOwnThread")) { // 将使它获得一个新的线程
        println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
    }

}

suspend fun upconfined(){

}
//非受限调度，挂起点线程和恢复之后线程。受到被调用挂起函数来决定
//不能在launch 调用mainScope的 suspend函数
