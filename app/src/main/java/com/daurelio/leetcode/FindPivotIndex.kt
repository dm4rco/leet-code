package com.daurelio.leetcode

/*
* Problem: https://leetcode.com/problems/find-pivot-index/
*
* Given an array of integers nums, calculate the pivot index of this array.
* The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
* If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
* Return the leftmost pivot index. If no such index exists, return -1.
* */

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

    nums.forEachIndexed { index, _ ->
        if (leftSide == intSum - leftSide - nums[index]) {
            return index
        }
        leftSide += nums[index]
    }
    return -1
}