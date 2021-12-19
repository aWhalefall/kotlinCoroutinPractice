package unit3

import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.CoroutineContext
/**
 * creat time 2021/12/19 下午5:55
 * author kuaidao
 * email : kuaidao2022@gmail.com
 * 协程异常处理类
 * 需要定义自己的伴生key
 */
class CoroutineExceptionHandler(val onErrorAction: (Throwable)->Unit):
    AbstractCoroutineContextElement(CoroutineExceptionHandler) {
     companion object Key:CoroutineContext.Key<CoroutineExceptionHandler>

    fun onError(error:Throwable){
        error.printStackTrace()
        onErrorAction(error)
    }
}