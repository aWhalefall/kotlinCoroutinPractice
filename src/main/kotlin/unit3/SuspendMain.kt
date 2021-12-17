package unit3

import kotlin.coroutines.startCoroutine

fun main(){
    runSuspend{

    }
}
suspend fun SuspendMain() {
}

internal fun runSuspend(block:suspend ()->Unit){
    val run=RunSuspend()
    block.startCoroutine(run)
    run.await()
}