package a0709a


interface Bar {
    fun foo() ="带来"
}

class MacBar:Bar{
    override fun foo(): String {
        return "电脑bar"
    }
}



class ComputerConsumer(val company: ComputerCompany):Producer{
    override fun producerComputer() {
       company.producerComputer()
    }

}

interface Producer{
    fun producerComputer()
}

class ComputerCompany:Producer{
    override fun producerComputer() {
        println("生产电脑")
    }

}
//接口这样写的意思

class Marker(val producer: Producer) :Producer by producer



 class BarWrapper(val bar: Bar): Bar by bar{
     override fun foo(): String {
         return "自己"
     }
 }


fun main(args: Array<String>) {

    val company=ComputerCompany()
    val marker=Marker(company)
    marker.producerComputer()

}