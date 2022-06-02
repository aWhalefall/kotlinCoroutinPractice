fun main() {

    var childActivity: ChildActivity? = ChildActivity()
    childActivity?.displayStaticVar()
    println( ChildActivity().name)
}

class ChildActivity : Activity() {
    fun displayStaticVar() {
        name = "卫超"
        println(name)
    }
}