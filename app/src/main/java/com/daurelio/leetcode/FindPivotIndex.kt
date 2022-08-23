package com.daurelio.leetcode

import kotlin.time.measureTime

fun main() {
    val testcase1 = intArrayOf(-1, -1, 1, 1, 0, 0)
    val testcase2 = intArrayOf(-1, -1, 0, 1, 1, -1)

    val result1 = pivotIndex(testcase1)
    val result2 = pivotIndex(testcase2)

    println("Result: $result1 Expected: 4")
    println("Result: $result2 Expected: 0")
}

fun pivotIndex(nums: IntArray): Int {


    var leftSide = 0
    val intSum = nums.sum()

    nums.forEachIndexed { index, element ->
        if (leftSide == intSum - leftSide - nums[index]) {
            return index
        }
        leftSide += nums[index]
    }
    return -1
}