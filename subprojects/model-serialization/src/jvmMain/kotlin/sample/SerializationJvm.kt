package sample

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule

private val jackson = ObjectMapper()
    .registerModule(KotlinModule())

actual fun Timestamp.toJson(): String {
    return jackson.writeValueAsString(this)
}