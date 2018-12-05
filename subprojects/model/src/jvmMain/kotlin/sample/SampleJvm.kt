package sample

actual fun currentTime(): Timestamp {
    return Timestamp(System.currentTimeMillis())
}