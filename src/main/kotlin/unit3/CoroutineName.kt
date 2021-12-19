package unit3


import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.CoroutineContext

/**
 * creat time 2021/12/19 下午6:06
 * author kuaidao
 * email : kuaidao2022@gmail.com
 * 协程名的实现
 */

public class CoroutineName(val name:String):
    AbstractCoroutineContextElement(CoroutineName) {
     companion object  Key: CoroutineContext.Key<CoroutineName>

    val nameCoroutine:String=name

}