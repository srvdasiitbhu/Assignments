package Assignment1

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class GCDKtTest {

    @Test
    fun `gcd of 10 and 15, returns 5`() {
        assertEquals(gcd(10,15),5)
    }

    @Test
    fun `gcd of 15 and 10, returns 5`() {
        assertEquals(gcd(15,10),5)
    }

    @Test
    fun `gcd of 10 and 10, returns 5`() {
        assertEquals(gcd(10,10),10)
    }

    @Test
    fun `gcd of 0 and 5, returns 5`() {
        assertEquals(gcd(0,5),5)
    }

    @Test
    fun `gcd of 5 and 0, returns 5`() {
        assertEquals(gcd(5,0),5)
    }

    @Test
    fun `gcd of 1 and 5, returns 1`() {
        assertEquals(gcd(1,5),1)
    }

    @Test
    fun `gcd of 5 and 1, returns 1`() {
        assertEquals(gcd(5,1),1)
    }

    @Test
    fun `gcd of 5 and 9, returns 1`() {
        assertEquals(gcd(5,9),1)
    }

    @Test
    fun `gcd of 1183019 and 28851538, returns 17657`() {
        assertEquals(gcd(1183019,28851538),17657)
    }

}