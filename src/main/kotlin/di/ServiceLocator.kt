package di

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/6/21 15:09
 * 服务定位器：创建和存储依赖项
 */
object ServiceLocator {
    fun getEngine(): Engine = Engine()
}

class Car1 {
    private val engine = ServiceLocator.getEngine()

    fun start() {
        engine.start()
    }
}

fun main(args: Array<String>) {
    val car =Car1()
    car.start()

}