//package unit5
//
//import kotlin.coroutines.CoroutineContext
//import kotlin.coroutines.EmptyCoroutineContext
//import kotlin.coroutines.startCoroutine
//
//
//fun lauch(context: CoroutineContext = EmptyCoroutineContext, block: suspend () -> Unit): Job {
//    val completion = StandaloneCoroutine(context)
//    block.startCoroutine(completion, completion)
//    return completion
//}
//
//class StandaloneCoroutine(context: CoroutineContext) : AbstractCoroutine<Unit>(context)