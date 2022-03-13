package Assignment1

import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    val size: Int = sc.nextInt()
    val arr = Array<Int>(size){0}

    for (i in 0 until size) {
        arr[i] = sc.nextInt()
    }
    findMaxMin3(arr, size)
}

//Method 1
fun findMaxMin(ar: Array<Int>, n: Int) {
    var max: Int
    var min: Int

    //If array contains only 1 element
    if (n==1) {
        max = ar[0]
        min = ar[0]
    }
    else
    //If array contains only 2 elements
    if (n==2) {
        if (ar[0] > ar[1]) {
            max = ar[0]
            min = ar[1]
        }
        else {
            max = ar[1]
            min = ar[0]
        }
    }
    else {
        if (ar[0] > ar[1]) {
            max = ar[0]
            min = ar[1]
        }
        else {
            max = ar[1]
            min = ar[0]
        }
       for (i in 2 until n) {
           if (ar[i] > max)
               max = ar[i]

           if (ar[i] < min)
               min = ar[i]
       }
    }
    print("Max = ")
    println(max)
    print("Min = ")
    println(min)
}

//Method 2
fun findMaxMin2(ar: Array<Int>, start: Int, end: Int) {
    var max: Int
    var min: Int

    //If array contains only 1 element
    if (start == end) {
        max = ar[start]
        min = ar[start]
    }
    else
    //If array contains only 2 elements
        if (start+1 == end) {
            if (ar[start] > ar[end]) {
                max = ar[start]
                min = ar[end]
            }
            else {
                max = ar[end]
                min = ar[start]
            }
        }
    else {
        var mid: Int = (start + end)/2
        findMaxMin2(ar, start, mid)
        findMaxMin2(ar, mid+1, end)
        }
}

fun findMaxMin3(ar: Array<Int>, n: Int) {

    var max: Int
    var min: Int
    var i: Int

    //If array contains only 1 element
    if (n==1) {
        max = ar[0]
        min = ar[0]
    }
    else
        if (n==2) {
            if (ar[0] > ar[1]) {
                max = ar[0]
                min = ar[1]
            }
            else {
                max = ar[1]
                min = ar[0]
            }
        }
    else {
            if (n % 2 == 0) {
                if (ar[0] > ar[1]) {
                    max = ar[0]
                    min = ar[1]
                } else {
                    max = ar[1]
                    min = ar[0]
                }
                i = 2
            } else {
                max = ar[0]
                min = ar[0]
                i = 1
            }

            while (i < n-1) {
                if (ar[i]>ar[i+1]){
                    if (ar[i]>max)
                        max=ar[i]
                    if (ar[i+1]<min)
                        min=ar[i+1]
                }
                else {
                    if (ar[i+1]>max)
                        max=ar[i+1]
                    if (ar[i]<min)
                        min=ar[i]
                }
                i += 2
            }
        }
    print("Max = ")
    println(max)
    print("Min = ")
    println(min)

}