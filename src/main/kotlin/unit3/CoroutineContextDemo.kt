package unit3


import java.lang.RuntimeException
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine
/**
 * creat time 2021/12/19 下午6:19
 * author kuaidao
 * email : kuaidao2022@gmail.com
 * 协程体返回结果是Resule<Any> 泛型类型∏
 */

fun main() {
//    CoroutineContextDemo().listAdd()
    CoroutineContextDemo().testCoroutineContext()
}
class CoroutineContextDemo {

    var list:List<Int> = emptyList()
    val contextCoroutine:CoroutineContext=CoroutineName("kuaidao_coroutine")+
            CoroutineExceptionHandler{
                throwable -> println("error show ${throwable.message}")
            }

    fun listAdd(){
        list+=0
        list+= listOf(1,2,3)
        println(list.toString())
    }

    fun testCoroutineContext(){
        suspend {
            println("In coroutine [${contextCoroutine[CoroutineName]?.nameCoroutine}]")
            println("coroutine body")
            //throw RuntimeException("runtimeException")
            5
        }.startCoroutine(object : Continuation<Int> {
            override val context: CoroutineContext
                get() = contextCoroutine

            override fun resumeWith(result: Result<Int>) {
                println("resumeWith call()")
//                result.onFailure {
//                    context[CoroutineExceptionHandler]?.onError(it)
//                }
                result.onSuccess {
                    println("resumeWith call() Success")
                }
            }

        })
    }
}