package unit10.annotation

import kotlin.reflect.KClass
/**
 * author：kuaidao2022@reworld.com
 * data: 2022/7/30 15:53
 *  sample @DeserializeInterface(interfaceImp::class) val company:Company
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.PROPERTY, AnnotationTarget.FIELD)
annotation class DeserializeInterface(val targetClass: KClass<out Any>)
