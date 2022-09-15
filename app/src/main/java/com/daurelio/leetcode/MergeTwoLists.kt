package com.daurelio.leetcode

/*
* Problem: https://leetcode.com/problems/merge-two-sorted-lists/
*
* You are given the heads of two sorted linked lists list1 and list2.
* Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
* Return the head of the merged linked list.
* */

fun main() {
    val testcase1a = ListNode(1)
    testcase1a.next = ListNode(2)
    testcase1a.next!!.next = ListNode(4)

    val testcase1b = ListNode(1)
    testcase1b.next = ListNode(3)
    testcase1b.next!!.next = ListNode(4)



}




class ListNode(var `val`: Int) {
    var next: ListNode? = null
}