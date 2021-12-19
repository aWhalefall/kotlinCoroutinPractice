package unit3

import kotlin.coroutines.AbstractCoroutineContextElement
import kotlin.coroutines.CoroutineContext
/**
 * creat time 2021/12/19 下午5:47
 * author kuaidao
 * email : kuaidao2022@gmail.com
 * 抽象的协程上下文，实现协程上下文【元素】更方便
 */
class CtineContextElement(key: CoroutineContext.Key<*>) : AbstractCoroutineContextElement(key) {
    override val key: CoroutineContext.Key<*>
        get() = super.key

}