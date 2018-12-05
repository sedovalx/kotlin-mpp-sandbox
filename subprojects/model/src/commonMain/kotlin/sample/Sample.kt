package sample

expect fun currentTime(): Timestamp

data class Timestamp(val millis: Long, val fraction: Int = 0) : Comparable<Timestamp> {
    override fun compareTo(other: Timestamp): Int {
        return when {
            this.millis != other.millis -> this.millis.compareTo(other.millis)
            else -> this.fraction.compareTo(other.fraction)
        }
    }
}