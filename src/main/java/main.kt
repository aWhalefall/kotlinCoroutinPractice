import java.sql.DriverManager.println


fun main(args: Array<String>) {
    val test= MediatorLiveDataTest()
    test.change()
    test.mediatorLiveData.value="你好"
}


class MediatorLiveDataTest {

    val mediatorLiveData =MedialLi

    fun change() {
        mediatorLiveData.addSource(mediatorLiveData) { inString ->

            println("输出 $inString")
        }
    }


}