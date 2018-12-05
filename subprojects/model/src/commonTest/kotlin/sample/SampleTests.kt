package sample

import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTests {
    @Test
    fun test_timestamp_creation() {
        val t = currentTime()
        assertEquals(0, t.fraction)
    }
}