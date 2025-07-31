package org.example


class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

fun middleNode(head: ListNode?): ListNode {
    var array = arrayListOf<ListNode>()
    var current = head
    var count = 0
    while (current != null){
        array.add(current)
        current = current.next
        count++
    }
    return array.get(count/2)
}