package sample

actual val Timestamp.Companion.now: Timestamp get() = Timestamp(System.currentTimeMillis())