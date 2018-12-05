package sample

import moment

actual val Timestamp.Companion.now: Timestamp get() = Timestamp(moment().valueOf().toLong())