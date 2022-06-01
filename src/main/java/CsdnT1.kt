object CsdnT1 {
    var n = 10
    @JvmStatic
    fun main(args: Array<String>) {
        val sc1 = SubClass(n)
        val sc2 = SSubClass()
    }
}

internal open class SubClass {
    var n = 0

    constructor() {
        println(" SubClass()")
    }

    constructor(n: Int) {
        this.n = n
        println("SubClass($n)")
    }
}

internal class SSubClass : SubClass {

    constructor() {
        println(" 子subClass()")
    }

    constructor(n: Int) {
        this.n = n
        println("子subClass($n)")
    }
}