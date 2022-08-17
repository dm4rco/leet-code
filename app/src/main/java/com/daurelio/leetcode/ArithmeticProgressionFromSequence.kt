package com.daurelio.leetcode

fun main() { //main only for testing purposes
    var arr = intArrayOf(3, 5, 1)

    //canMakeArithmeticProgression(arr)
    //println(canMakeArithmeticProgression(arr))

    arr = intArrayOf(-12, 12, 24)

    canMakeArithmeticProgression(arr)
    println(canMakeArithmeticProgression(arr))

    arr = intArrayOf(-100, -200, -500)

    canMakeArithmeticProgression(arr)
    println(canMakeArithmeticProgression(arr))
}

fun canMakeArithmeticProgression(arr: IntArray): Boolean {
    arr.sortDescending()

    val baseline = arr[0] - arr[1]

    var prevVal = arr[0]
    val arr2 = arr.drop(1)

    arr2.forEach {
        if (prevVal - it != baseline) {
            return false
        }
        prevVal = it
    }
    return true
}
