package unit3

import kotlin.coroutines.resume
import kotlin.coroutines.suspendCoroutine

class SnippetKt {
    suspend fun notSuspend()= suspendCoroutine<Int> { continuation ->
        continuation.resume(100)
    }
}
