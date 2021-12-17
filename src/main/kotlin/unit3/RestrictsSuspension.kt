package unit3

import kotlin.coroutines.RestrictsSuspension

fun main() {
    launchRestrictscope()
}
@RestrictsSuspension
class RestrictsSope<T> {
    suspend fun produce(value:T){
        println("挂起函数 RestrictsScopevalue =$value")
    }
}

//正常delay 无法调用或者无法通过编译
private fun launchRestrictscope(){
    launchCoroutine(RestrictsSope<Int>()){
        produce(1)
        //delay(1000)
        produce(2)
    }
}