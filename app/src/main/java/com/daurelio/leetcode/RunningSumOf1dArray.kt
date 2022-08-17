package com.daurelio.leetcode

fun main() { // Just for testing - not submitted
    var intArray = intArrayOf(1, 2, 3, 4) // Testcase
    val result1 = runningSum(intArray)

    intArray = intArrayOf(1, 1, 1, 1, 1)
    val result2 = runningSum(intArray)

    intArray = intArrayOf(3, 1, 2, 10, 1)
    val result3 = runningSum(intArray)
}

fun runningSum(nums: IntArray): IntArray {


    nums.forEachIndexed { index, element ->
        if (index != 0) {
            nums[index] = element + nums[index - 1]
        }
    }

    return nums

}