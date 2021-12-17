package unit3

import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext
import kotlin.coroutines.startCoroutine

/**
 * creat time 2021/12/16 下午8:02
 * author kuaidao
 * email : kuaidao2022@gmail.com
 */
object SupportCoroutine {

    fun <R,T> launchCoroutine(receiver: R,block:suspend R.() ->T){
        block.startCoroutine(receiver, object : Continuation<T> {
            override val context: CoroutineContext
                get() = EmptyCoroutineContext

            override fun resumeWith(result: Result<T>) {
                println("Corountine End: $result")
            }

        })
    }
}