package sample

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SampleTests {
    @Test
    fun testTimestampsCreation() {
        val t = currentTime()
        assertEquals(0, t.fraction)
    }

    @Test
    fun testTimestampsComparison() {
        assertEquals(Timestamp(1, 10), Timestamp(1, 10))

        assertTrue(Timestamp(1, 10) < Timestamp(2, 1))
        assertTrue(Timestamp(1, 10) < Timestamp(1, 11))
    }
}