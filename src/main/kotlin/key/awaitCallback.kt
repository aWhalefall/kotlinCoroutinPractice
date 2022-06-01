package key

import kotlinx.coroutines.suspendCancellableCoroutine
import javax.security.auth.callback.Callback

//suspend fun awaitCallback(): T = suspendCancellableCoroutine { continuation ->
//    val callback = object : Callback { // Implementation of some callback interface
//        override fun onCompleted(value: T) {
//            // Resume coroutine with a value provided by the callback
//            continuation.resume(value)
//        }
//        override fun onApiError(cause: Throwable) {
//            // Resume coroutine with an exception provided by the callback
//            continuation.resumeWithException(cause)
//        }
//    }
//    // Register callback with an API
//    api.register(callback)
//    // Remove callback on cancellation
//    continuation.invokeOnCancellation { api.unregister(callback) }
//    // At this point the coroutine is suspended by suspendCancellableCoroutine until callback fires
//}
