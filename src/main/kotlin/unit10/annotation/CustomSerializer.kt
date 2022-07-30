package unit10.annotation

import unit10.ValueSerializer
import kotlin.reflect.KClass

@Target(AnnotationTarget.FIELD, AnnotationTarget.PROPERTY)
annotation class CustomSerializer(val targetClass: KClass<out ValueSerializer<*>>)
