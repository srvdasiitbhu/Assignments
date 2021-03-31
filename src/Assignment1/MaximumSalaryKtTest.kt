package Assignment1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import java.util.*

internal class MaximumSalaryKtTest {

    @Test
    fun `for n=2 & arr = 21 2, returns 221` () {
        val arr:Vector<String> = Vector<String>()
        arr.add("21")
        arr.add("2")
        assertEquals(printMaximum(arr),"221")
    }

    @Test
    fun `for n=2 & arr = 23 3, returns 323` () {
        val arr:Vector<String> = Vector<String>()
        arr.add("23")
        arr.add("3")
        assertEquals(printMaximum(arr),"323")
    }
}