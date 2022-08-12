package demo

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/8/8 11:10
 * 任何类的解析抽象
 */
interface CallAdapter<T> {

    fun toJson(): String

    fun fromJson(): T

}