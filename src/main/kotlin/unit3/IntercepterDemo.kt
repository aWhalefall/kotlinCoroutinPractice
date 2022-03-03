package unit3

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

/**
 * creat time 2021/12/19 下午6:42
 * author kuaidao
 * email : kuaidao2022@gmail.com
 * 带拦截器的用法
 */
fun main() {
    IntercepterDemo().test()
}
class IntercepterDemo {

    fun test(){
        suspend {
            suspendfun02("hello","kotlin")
            println("挂起间隙调用")
            suspendfun02("hello","Coroutine")
        }.startCoroutine(object : Continuation<Int> {

            override fun resumeWith(result: Result<Int>) {
              println("resumeWith call()")
            }

            override val context: CoroutineContext
                get() = EmptyCoroutineContext

        })
        println("函数内")
    }
}