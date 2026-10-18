package io.github.kotlinmania.acceleratesrc

import kotlin.test.Test
import kotlin.test.assertEquals

class AccelerateSrcTest {
    @Test
    fun testFrameworkName() {
        assertEquals("Accelerate", AccelerateSrc.FRAMEWORK_NAME)
    }
}
