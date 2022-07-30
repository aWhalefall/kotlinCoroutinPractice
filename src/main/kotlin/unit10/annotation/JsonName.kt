package unit10.annotation

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/7/30 15:27
 * 序列化更改名称
 * 可用同时用在kotlin 属性注解和java 类对象注解
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class JsonName(val name: String)

