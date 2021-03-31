package Assignment1

// Kotlin program to find the maximum salary
import java.util.*
fun main(args: Array<String>) {

    val read = Scanner(System.`in`)
    var n = read.nextInt()
    var i = 0
    val arr:Vector<String> = Vector<String>()

    while (i < n) {
        var num = read.next()
        arr.add(num)
        i++
    }
    print(printMaximum( arr ))
}

/**
 * Function to compose the largest number out of a set of integers
 * @param arr vector of string numbers
 * @return largest possible number out of the vector
 */
public fun printMaximum ( arr: Vector<String>): String {

    Collections.sort<String>(arr, object:Comparator<String> {
        // A comparison function which is used by
        // sort() in printMaximum()
        public override fun compare(X:String, Y:String):Int {
            // first append Y at the end of X
            val XY = X + Y
            // then append X at the end of Y
            val YX = Y + X
            // Now see which of the two
            // formed numbers
            // is greater
            return if (XY.compareTo(YX) > 0) -1 else 1
        }
    })
    var s = ""
    val it = arr.iterator()
    while (it.hasNext())
        s = s.plus(it.next())

    return  s

}