package com.daurelio.leetcode

/*
* Problem: https://leetcode.com/problems/isomorphic-strings/
*
* Given two strings s and t, determine if they are isomorphic.
* Two strings s and t are isomorphic if the characters in s can be replaced to get t.
* All occurrences of a character must be replaced with another character while preserving the order of characters.
* No two characters may map to the same character, but a character may map to itself.
* */

fun main() {
    val testcase1S = "egg"
    val testcase1T = "add"

    val testcase2S = "foo"
    val testcase2T = "bar"

    val testcase3S = "paper"
    val testcase3T = "title"

    val testcase4S = "bbbaaaba"
    val testcase4T = "aaabbbba"

    val result1 = isIsomorphic(testcase1S, testcase1T)
    val result2 = isIsomorphic(testcase2S, testcase2T)
    val result3 = isIsomorphic(testcase3S, testcase3T)
    val result4 = isIsomorphic(testcase4S, testcase4T)

    println("Result: $result1 Expected: true")
    println("Result: $result2 Expected: false")
    println("Result: $result3 Expected: true")
    println("Result: $result4 Expected: false")
}

fun isIsomorphic(s: String, t: String): Boolean {

    val mapping = HashMap<Char, Char>()

    s.forEachIndexed { index, charS ->
        val charT = t[index]

        if (mapping.containsKey(charS)) {
            if (mapping[charS] != charT) {
                return false
            }
        } else {
            if (mapping.containsValue(charT)) {
                return false
            }
            mapping[charS] = charT
        }
    }

    return true
}
