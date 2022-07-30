package unit10

class Test {

    val callBack= object : CallBack {
        override fun call() {
            println("call")
        }
    }



}

interface CallBack{
    fun call()
}


