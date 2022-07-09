package unit5

import kotlinx.coroutines.DisposableHandle
import kotlinx.coroutines.runBlocking
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.suspendCoroutine

fun main() = runBlocking {

    val job = suspend { }

}

interface Job : CoroutineContext.Element {

    companion object Key : CoroutineContext.Key<Job>

    override val key: CoroutineContext.Key<*>
        get() = Job

    val isActivity:Boolean

//    fun invokeOnCancel(onCancel:OnCancel):Disposable
//
//    fun invokeOnComplete(onComplete:OnConplete):Disposable
//
//    fun cancel()
//
//    fun remove(disposable:Disposable)
//
//    suspend fun join()

}