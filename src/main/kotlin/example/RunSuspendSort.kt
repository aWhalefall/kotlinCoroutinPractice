package example

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    test2()
    test()
}

 fun test() {
    println("test1")
}

suspend fun test2() {
    delay(2000)
    println("test2")
}