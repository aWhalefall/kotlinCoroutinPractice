package simpleCoroutein

import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.runBlocking

class FilterSamper {
}

fun main() = runBlocking<Unit> {
//sampleStart
    (1..5).asFlow().filter {
            println("Filter $it")
            it % 2 == 0
        }
        .map{
            println("Map $it")
            "string $it"
        }.collect {
            println("Collect $it")
        }
//sampleEnd
}