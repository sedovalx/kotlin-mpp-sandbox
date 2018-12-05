package sample

expect val Timestamp.Companion.now: Timestamp

data class Timestamp(val millis: Long, val fraction: Int = 0) : Comparable<Timestamp> {
    @Suppress("RemoveEmptyClassBody")
    companion object { }

    override fun compareTo(other: Timestamp): Int {
        return when {
            this.millis != other.millis -> this.millis.compareTo(other.millis)
            else -> this.fraction.compareTo(other.fraction)
        }
    }
}