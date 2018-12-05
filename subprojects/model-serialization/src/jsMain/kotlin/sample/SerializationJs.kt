package sample

actual fun Timestamp.toJson(): String {
    return """{"millis":$millis,"fraction":$fraction}"""
}