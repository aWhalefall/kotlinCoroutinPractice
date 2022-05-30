package unit5

import java.util.concurrent.atomic.AtomicReference
import kotlin.coroutines.Continuation
import kotlin.coroutines.CoroutineContext

abstract class AbstractCoroutine<T>(context: CoroutineContext) : Job, Continuation<T> {

    protected val state = AtomicReference<CoroutineState>()

    override val context: CoroutineContext

    init {
        state.set(CoroutineState.inComplete())
        this.context = context + this
    }

    val isCompleted
        get() = state.get() is CoroutineState.Complete<*>

    override val isActivity: Boolean
        get() = when (state.get()) {
            is CoroutineState.Complete<*>,
            is CoroutineState.Canceling -> false
            else -> true
        }


    override val key: CoroutineContext.Key<*>
        get() = super.key

    override fun invokeOnCancel(onCancel: OnCancel): Disposable {
        TODO("Not yet implemented")
    }

    override fun invokeOnComplete(onComplete: OnConplete): Disposable {
        TODO("Not yet implemented")
    }

    override fun cancel() {
        TODO("Not yet implemented")
    }

    override fun remove(disposable: Disposable) {
        TODO("Not yet implemented")
    }

    override suspend fun join() {
        TODO("Not yet implemented")
    }

    override fun resumeWith(result: Result<T>) {
        TODO("Not yet implemented")
    }
}