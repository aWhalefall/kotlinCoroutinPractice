package simpleCoroutein

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.runBlocking

class FlowSample {
}
/**
 * creat time 2022/3/6 下午12:24
 * author kuaidao
 * email : kuaidao2022@gmail.com
 * 可以将序列与集合方面的转换成流adFlow
 */
fun main() = runBlocking<Unit> {
//sampleStart
    // 将一个整数区间转化为流
    (1..3).asFlow().collect { value -> println(value) }
//sampleEnd
}