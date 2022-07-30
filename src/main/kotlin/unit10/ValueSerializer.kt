package unit10

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/7/30 16:07
 * 序列化,反序列化
 */
interface ValueSerializer<T> {
    fun toJsonValue(value:T):Any?
    fun fromJsonValue(value: Any?):T
}