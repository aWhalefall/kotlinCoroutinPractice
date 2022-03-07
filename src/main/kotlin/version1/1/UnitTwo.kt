package version1.`1`

class UnitTwo {
}

//sampleStart
inline fun <E> Iterable<E>.strings(transform: (E) -> String = { it.toString() }) =
    map { transform(it) }

val defaultStrings = listOf(1, 2, 3).strings()
val customStrings = listOf(1, 2, 3).strings { "($it)" }
//sampleEnd

class User(name:String){
    var name = name
}

fun main(args: Array<String>) {
   // inlineAnoMedthod()


   // listExtend()

   // associateWith()

    //sampleStart
    fun printAllUppercase(data: List<String>) {
        val result = data
            .filter {
                it.all {
                        c -> c.isUpperCase() } }
            .ifEmpty { listOf("<no uppercase>") }
        result.forEach { println(it) }
    }

    printAllUppercase(listOf("Bar", "Bar"))
    printAllUppercase(listOf("FOO", "BAR"))
//sampleEnd

}

private fun associateWith() {
    //sampleStart
    val keys = 'a'..'f'
    val map = keys.associateWith { User(it.toString()) }
    map.forEach {
        println(it)
    }
//sampleEnd
}

private fun listExtend() {
    //sampleStart
    val items = (1..5).toMutableList()

    items.shuffle()
    println("Shuffled items: $items")

    items.replaceAll { it * 2 }
    println("Items doubled: $items")

    items.fill(5)
    println("Items filled with 5: $items")
//sampleEnd
}

private fun inlineAnoMedthod() {
    println("defaultStrings = $defaultStrings")
    println("customStrings = $customStrings")
}