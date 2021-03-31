package Assignment1

// Kotlin program to find GCD of two numbers
import java.util.*
fun main(args: Array<String>) {

    val read = Scanner(System.`in`)

    var num1 = read.nextInt()
    var num2 = read.nextInt()
    println(gcd (num1, num2))

}

/**
 * Function to calculate GCD or HCF of two numbers
 *
 * @param a first number
 * @param b second number
 * @return GCD of a and b
 */
public fun gcd (a: Int, b: Int): Int {

    if (a == 0)
        return b;
    if (b == 0)
        return a;

    // base case
    if (a == b)
        return a;

    // a is greater
    if (a > b)
        return gcd(a-b, b);
    return gcd(a, b-a);
}