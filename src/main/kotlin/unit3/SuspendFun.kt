package unit3

import kotlin.concurrent.thread
import kotlin.coroutines.suspendCoroutine

class SuspendFun {
}

suspend fun suspendFun01(a:Int){
return
}

suspend fun suspendfun02(a:String,b:String)= suspendCoroutine<Int> {
    continuation ->
    thread {
        continuation.resumeWith(Result.success(5))
    }
}
