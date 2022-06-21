import kotlinx.coroutines.*

/**
 * 协程挂起点
 * interface continue(){
 *      resumeWith()
 * }
 *
 * 在main中开启子线程。造成一个主线程和一个子线程
 *  问 ：主线程和子线程谁先执行
 *  答： 大概率是主线程，原因 子线程开启会耗时。造成cpu资源被UI主线程抢占
 *  问：如果开启多个子线程 （大于10个）
 *  答：线程抢占资源就有随机性。如果for循环开启多个子线程，那么cpu资源会被For循环抢占。是否主线程内容输出具有随机性。大概率子线程会优先输出
 *  然后中间主线程输出，然后子线程输出
 *
 *  2.在协程中保证程序运行时序
 */
//fun main() {
//
//    Thread(Runnable {
//        test()
//    }).start()
//    Thread(Runnable {
//        test()
//    }).start()
//
//    test1()
//}


fun main() = runBlocking {

    launch {
        withContext(Dispatchers.IO) {
            test2()
        }
        println("内部函数执行" + Thread.currentThread().name)
    }

    println(System.currentTimeMillis())
    //延时非阻塞.将执行时间让出当前线程
    delay(1000)

    for (i in 1..100) {
        test1()
    }
}

fun main2() {

    val mainScope = CoroutineScope(Dispatchers.Default)

    for (i in 1..100) {
        mainScope.launch {
            test2()
        }
    }
    //delay(1000)

    for (i in 1..100) {
        test1()
    }
}


fun test() {
    println("我是挂起函数  ${Thread.currentThread().name}")
}

suspend fun test2() {
    withContext(Dispatchers.Unconfined) {
        println("我是挂起函数2  ${Thread.currentThread().name} ${System.currentTimeMillis()}")
    }
}

fun test1() {
    println("我是普通函数------------  ${Thread.currentThread().name} ${System.currentTimeMillis()}")
}

