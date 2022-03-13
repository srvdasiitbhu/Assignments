package Assignment1

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val size = sc.nextInt()
    val arr  = Array<Int>(size){0}

    for (i in 0 until size) {
        arr[i] = sc.nextInt()
    }
    segregate(arr, size)

    for (i in 0 until size) {
        print(arr[i])
        print(" ")
    }
}

fun segregate(ar: Array<Int>, n: Int) {

    var c: Int = 0
    var d: Int = 0

    for (i in 0 until n) {
        if (ar[i] == 0)
            c++
        if (ar[i] == 1)
            d++
    }

    for (i in 0 until c)
        ar[i] = 0
    for (i in c until c+d)
        ar[i] = 1
    for (i in c+d until n)
        ar[i] = 2
}