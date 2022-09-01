package com.daurelio.leetcode

/*
* Problem: https://leetcode.com/problems/is-subsequence/
*
* Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
* A subsequence of a string is a new string that is formed from the original string by deleting some
* (can be none) of the characters without disturbing the relative positions of the remaining characters.
* (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
* */

fun main() {
    val testcase1S = "abc"
    val testcase1T = "ahbksc"

    val testcase2S = "aaaaaa"
    val testcase2T = "bbaaaa"

    val testcase3S = "abc"
    val testcase3T = "acbs"

    val result1 = isSubsequence(testcase1S, testcase1T)
    val result2 = isSubsequence(testcase2S, testcase2T)
    val result3 = isSubsequence(testcase3S, testcase3T)

    println("Result: $result1 Expected: true")
    println("Result: $result2 Expected: false")
    println("Result: $result3 Expected: false")
}

fun isSubsequence(s: String, t: String): Boolean {

    var stringT = t

    var counter = 0
    s.forEach { charS ->
        val charFoundAt = charExistsInString(charS, stringT)
        if (charFoundAt != -1) {
            stringT = stringT.drop(charFoundAt + 1)
            counter++
        }
    }

    if (counter == s.length) {
        return true
    }

    return false
}

private fun charExistsInString(char: Char, string: String): Int {
    string.forEachIndexed { index, c ->
        if (c == char) {
            return index
        }
    }

    return -1
}
