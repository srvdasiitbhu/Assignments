package Assignment1

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val size: Int = sc.nextInt()
    val arr = Array<Int>(size){0}

    for (i in 0 until size) {
        arr[i] = sc.nextInt()
    }
    //reverse2(arr, size)
    reverse3(arr, 0, size-1)

    for (i in 0 until size) {
        print(arr[i])
        print(' ')
    }

}

fun reverse(ar: Array<Int>, n: Int) {

    for (i in n-1 downTo 0) {
        print(ar[i])
        print(' ')
    }
}

fun reverse2(ar: Array<Int>, n: Int) {

    var start: Int = 0
    var end: Int = n-1
    var temp: Int
    while (start < end) {
        temp = ar[start]
        ar[start] = ar[end]
        ar[end] = temp
        start++
        end--
    }

    for (i in 0 until n) {
        print(ar[i])
        print(' ')
    }
}

fun reverse3(ar: Array<Int>, start: Int, end: Int) {

    var temp: Int
    if(start < end) {
        temp = ar[start]
        ar[start] = ar[end]
        ar[end] = temp
        reverse3(ar, start + 1, end - 1)
    }
}