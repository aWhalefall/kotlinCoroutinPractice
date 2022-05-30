package unit5

/**
 * creat time 2022/4/19 下午9:47
 * author kuaidao
 * email : kuaidao2022@gmail.com
 * 封装协程状态
 */
sealed class CoroutineState {

    class inComplete() : CoroutineState()
    class Canceling() : CoroutineState()
    class Complete<T>(val value: T? = null, val throwable: Throwable? = null) : CoroutineState()

}

sealed class DisposableList{
    object Nil:DisposableList()
    class Cons(
        val head:Disposable,val tail:DisposableList):DisposableList()
}

