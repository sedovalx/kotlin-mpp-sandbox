package sample

import kotlin.test.Test
import kotlin.test.assertEquals

class SerializationTest {
    @Test
    fun testTimestampSerialization() {
        val t = Timestamp(12345, 12)
        assertEquals("""{"millis":12345,"fraction":12}""", t.toJson())
    }
}