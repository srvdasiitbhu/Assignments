package Assignment1

import java.util.*

fun main(args: Array<String>) {

    val sc = Scanner(System.`in`)
    val n: Int = sc.nextInt()
    val x: Int = sc.nextInt()
    //val arr = arrayOf(1,2,2,1,0,0)

    val r: Int = n % 6

    if (r == 0) {
        if (x == 0)
            print(0)
        else if (x == 1)
            print(1)
        else
            print(2)
    }
    else {
        if (r == 1) {
            if (x==1)
                print(0)
            else if (x==0)
                print(1)
            else
                print(2)
        }
        else if (r == 2) {
            if (x==2)
                print(0)
            else if (x==0)
                print(1)
            else
                print(2)
        }
        else if (r == 3) {
            if (x==2)
                print(0)
            else if (x==1)
                print(1)
            else
                print(2)
        }
        else if (r == 4) {
            if (x==1)
                print(0)
            else if (x==2)
                print(1)
            else
                print(2)
        }
        else if (r == 5) {
            if (x==0)
                print(0)
            else if (x==2)
                print(1)
            else
                print(2)
        }

    }
}