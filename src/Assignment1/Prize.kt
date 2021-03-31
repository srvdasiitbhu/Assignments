package Assignment1

// Kotlin program to find maximum no. of prizes
import java.util.*
fun main(args: Array<String>) {

    val read = Scanner(System.`in`)

    var n = read.nextInt()

    print(maxPrizes(n))
}

/**
 * Function to represent a given positive
 * integer n as many pairwise distinct
 * positive integers as possible
 *
 * @param n given positive integer
 * @return Maximum no. k that n can be represented and
 * k pairwise distinct positive integers that sum upto n.
 */
public fun maxPrizes (n: Int): String {

    var total = 0
    var increment = 1
    var c = 0
    var s = ""
    val list = mutableListOf<Int>()

    while ((total + increment) <=n) {
        total += increment
        list.add(increment)
        increment++
        c++
    }
    list[c-1] += n - total
    s = s.plus("$c\n")
    list.forEach {
        s = s.plus("$it ")
    }

    return s
}