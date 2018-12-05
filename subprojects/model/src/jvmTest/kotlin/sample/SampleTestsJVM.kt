package sample

import kotlin.test.Test
import kotlin.test.assertTrue

class SampleTestsJVM {
    @Test
    fun `test timestamp`() {
        val t = Timestamp.now
        assertTrue(System.currentTimeMillis() - t.millis <= 10)
    }
}