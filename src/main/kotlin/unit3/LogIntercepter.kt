package unit3

import kotlin.coroutines.Continuation
import kotlin.coroutines.ContinuationInterceptor
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.startCoroutine
/**
 * creat time 2021/12/19 下午8:30
 * author kuaidao
 * email : kuaidao2022@gmail.com
 *
 * 1.默认执行resumeWith 进入拦截器
 * 2.拦截器执行恢复调用，调用进入协程体，挂起点
 * 3.执行拦截器动作
 * 4.进入挂起点内部异步处理逻辑拿到结果resumeWithf恢复调用
 * 5.进入拦截器
 * 6.重复执行2.3.4.5
 *
 *  before resumewith :Success(kotlin.Unit)
    after resumewith
    before resumewith :Success(5)
    after resumewith
    before resumewith :Success(5)
    Coroutine End Success(5)
    after resumewith
 *
 */
class LogIntercepter : ContinuationInterceptor {
    override val key = ContinuationInterceptor
    override fun <T> interceptContinuation(continuation: Continuation<T>) =LogContinuation(continuation)
}

class LogContinuation<T>(private val continuation: Continuation<T>) : Continuation<T> by continuation{
    override fun resumeWith(result: Result<T>) {
        println("before resumewith :$result")
        continuation.resumeWith(result)
        println("after resumewith")
    }
}

fun main() {
    test()
}

fun test(){
    suspend {
       suspendfun02("kuaidao","kotlin")
       suspendfun02("kuaidao","coroutine")
    }.startCoroutine(object : Continuation<Any> {
        override val context: CoroutineContext
            get() = LogIntercepter()

        override fun resumeWith(result: Result<Any>) {
            println("Coroutine End $result")
        }

    })

    println("写成之后执行")
}