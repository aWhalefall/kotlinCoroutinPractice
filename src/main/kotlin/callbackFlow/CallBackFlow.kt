package callbackFlow

import kotlinx.coroutines.*

class CallBackFlow<T> {

//    fun  flowForm(api:CallbackBasedApi):Flow<T> = callbackFlow {
//        val callback= object : Callback {
//
//        }
//    }
}


//fun main() = runBlocking {
////    supervisorScope {
//        launch {
//            launch {
//                print2("level 2")
//                launch {
//                    print2("level 3")
//                    launch {
//                        print2("level 4")
//                    }
//                }
//            }
//        }
//        launch {
//            print2("level 1")
//        }
//        print2("12")
////    }
//}


private fun CoroutineScope.codeThatCanThrowExceptions() {
    throw java.lang.RuntimeException("1212")
}

private fun supervisorScope1() {
    // Scope handling coroutines for a particular layer of my app
}

suspend fun print() {
    println("顶部执行")
}

suspend fun print2(msg: String = "level 0") {
    println(msg +"${Thread.currentThread().name}")
}

suspend fun loop(block: () -> Unit) {
    for (i in 0..10) {
        block()
    }
}

val handler = CoroutineExceptionHandler { context, exception ->
    println("Caught $exception")
}

private fun CoroutineScope.exceptionUp() {
    val uiScope = CoroutineScope(coroutineContext)
    uiScope.launch { println("1") }
    uiScope.launch { throw java.lang.RuntimeException("up") }
    uiScope.launch { println("3") }
    uiScope.launch { println("4") }
}

suspend fun CoroutineScope.cancelAsyn() {
    try {
        val deffer = async { delay(2000) }
        deffer.await()
        deffer.cancel()
    } catch (e: Exception) {
        println(e.toString())
    }

}

suspend fun CoroutineScope.cancelLaunch() {
    try {
        val job = launch {
            delay(2000)
            println("complete")
        }
//        job.join()
//        job.cancel()
        job.cancelAndJoin()
    } catch (e: java.lang.Exception) {
        println(" launch " + e.toString())
    }
}