package exception

import kotlin.coroutines.ContinuationInterceptor
import kotlin.coroutines.CoroutineContext

interface CompanionDemo {
    companion object Key : CoroutineContext.Key<ContinuationInterceptor>

}