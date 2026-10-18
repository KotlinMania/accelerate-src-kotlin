// port-lint: tests tests/lib.rs
package io.github.kotlinmania.acceleratesrc

import kotlinx.cinterop.ExperimentalForeignApi
import kotlinx.cinterop.alloc
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.ptr
import kotlinx.cinterop.value
import platform.Accelerate.cblas_srotg
import kotlin.test.Test
import kotlin.test.assertEquals

@OptIn(ExperimentalForeignApi::class)
class AppleLinkTest {
    @Test
    fun link() {
        memScoped {
            val a = alloc<kotlinx.cinterop.FloatVar>()
            val b = alloc<kotlinx.cinterop.FloatVar>()
            val c = alloc<kotlinx.cinterop.FloatVar>()
            val d = alloc<kotlinx.cinterop.FloatVar>()
            a.value = 0.0f
            b.value = 0.0f
            c.value = 42.0f
            d.value = 42.0f

            cblas_srotg(a.ptr, b.ptr, c.ptr, d.ptr)

            assertEquals(1.0f, c.value)
            assertEquals(0.0f, d.value)
        }
    }
}
