package sample

import moment

actual fun currentTime(): Timestamp {
    return Timestamp(moment().valueOf().toLong())
}