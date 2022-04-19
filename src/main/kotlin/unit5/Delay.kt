package unit5

import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import java.util.concurrent.Executors
import java.util.concurrent.TimeUnit
import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine


suspend fun delay2(time: Long, millSecond: TimeUnit = TimeUnit.MILLISECONDS) {
    if (time <= 0) {
        return
    }
    suspendCoroutine<Unit> { continuation ->
        executor.schedule({ continuation.resume(Unit) }, time, millSecond)
    }

}


private val executor = Executors.newScheduledThreadPool(1) { runtime ->
    Thread(runtime, "schduler").apply { isDaemon = true }
}
class  Delay{
    fun main() = runBlocking {
        launch {
            print("开始执行")
            delay2(3000)
            print("我延时三秒哦")
        }
    }
}




fun main1() = runBlocking {
    launch {
        print("开始执行")
        delay2(3000)
        print("我延时三秒哦")
    }
}