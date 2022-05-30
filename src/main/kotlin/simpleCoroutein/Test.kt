package simpleCoroutein

import kotlinx.coroutines.*
import kotlinx.coroutines.GlobalScope.coroutineContext
import kotlin.coroutines.coroutineContext

class Test {
}

fun main() = runBlocking{
    dosomeone()
    dosometwo()
    print("third")
}

suspend fun dosomeone()= coroutineScope{
    withContext(Dispatchers.IO){
        println("first")
        println("first")
        println("first")
        delay(500)
    }
    println("first----")
    println("first")
    println("first")

}
suspend fun dosometwo(){
    print("second")
}