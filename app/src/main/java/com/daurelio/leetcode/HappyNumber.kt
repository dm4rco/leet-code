package com.daurelio.leetcode

import kotlin.math.pow

fun main() { //main just for testing purposes

    val result = isHappy(19)

    println(result)

}

fun isHappy(n: Int): Boolean {

    var result = sliceNumber(n)
    var index = 0

    while (result != 1) {
        if (result.toFloat() > 2.0.pow(31) - 1) {
            return false
        }
        index++
        result = sliceNumber(result)

        if (index >= 10000) {
            return false
        }
    }

    return true
}

fun sliceNumber(n: Int): Int {
    var number = n
    val squaredDigits = mutableListOf<Float>()
    var singleDigit: Int

    while (number > 0) {
        singleDigit = number % 10
        number /= 10
        squaredDigits.add(singleDigit.toFloat().pow(2))
    }

    return squaredDigits.sum().toInt()
}
