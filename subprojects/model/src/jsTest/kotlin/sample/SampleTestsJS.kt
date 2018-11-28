package sample

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class SampleTestsJS {
    @Test
    fun testHello() {
        assertTrue("JS" in hello())
    }

    @Test
    fun anotherTest() {
        assertEquals("1", "1")
    }
}