package com.daurelio.leetcode

/*
* Problem: https://leetcode.com/problems/shifting-letters/
*
* You are given a string s of lowercase English letters and an integer array shifts of the same length.
* Call the shift() of a letter, the next letter in the alphabet, (wrapping around so that 'z' becomes 'a').
* For example, shift('a') = 'b', shift('t') = 'u', and shift('z') = 'a'.
* Now for each shifts[i] = x, we want to shift the first i + 1 letters of s, x times.
* Return the final string after all such shifts to s are applied.
* */

fun main() {
    val result = shiftingLetters("aaa", intArrayOf(1, 2, 3))
    println(result)

}

fun shiftingLetters(s: String, shifts: IntArray): String {
    val result = s.toCharArray()

    val test = mutableMapOf<Char, Int>()

    s.forEachIndexed { index, c ->
        println(shifts[index])
        println(shifts.dropLast(s.length - index - 1))

        test[result[index]] = 2
    }

    s.forEachIndexed { index, _ ->
        for (i in 0..index) {
            val int = shiftLetter(result[i], shifts[index] % 26)
            result[i] = int.toChar()
        }
    }

    return String(result)
}

fun shiftLetter(toBeShifted: Char, shiftBy: Int): Int {
    var result = toBeShifted.toInt() + shiftBy

    if (result > 122) {
        result -= 26
    }

    return result
}

