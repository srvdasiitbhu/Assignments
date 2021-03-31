package Assignment1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class PrizeKtTest {

    @Test
    fun `sum of 6 pairwise distinct positive integers possible, list = 1 2 3`() {
        assertEquals(maxPrizes(6),"3\n1 2 3 ")
    }

    @Test
    fun `sum of 8 pairwise distinct positive integers possible, list = 1 2 5`() {
        assertEquals(maxPrizes(8),"3\n1 2 5 ")
    }

    @Test
    fun `sum of 2 pairwise distinct positive integers possible, list = 2`() {
        assertEquals(maxPrizes(2),"1\n2 ")
    }

    @Test
    fun `sum of 1 pairwise distinct positive integers possible, list = 1`() {
        assertEquals(maxPrizes(1),"1\n1 ")
    }
}