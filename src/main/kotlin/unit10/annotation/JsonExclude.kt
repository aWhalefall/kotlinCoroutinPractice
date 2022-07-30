package unit10.annotation

/**
 * author：kuaidao2022@reworld.com
 * data: 2022/7/30 15:27
 * 序列化例外
 *  注解只是用来定义关联到声明和表达式的元数据的结构，不能包含任何代码
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude()

