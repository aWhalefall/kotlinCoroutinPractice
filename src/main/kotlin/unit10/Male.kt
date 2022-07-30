package unit10

import unit10.annotation.DeserializeInterface

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/7/30 15:57
 * 对注解进行反序列化
 * out Any = <T super Any>
 */
data class Male(val name: String, val age: Int, @DeserializeInterface(CompanyImp::class) val company: Company)

class CompanyImp : Company {
    override val name: String
        get() = "yangweichao"

}
