package org.example

fun main() {
    println("Hello World!")
    println(sum(5,6)) // 2235. Add Two Integers
    val root = TreeNode(15) // 2236. Root Equals Sum of Children
    root.left = TreeNode(4)
    root.right = TreeNode(9)
    println(checkTree(root))

    val nums = arrayOf(5,6,3,1,3)
    val bebra = runningSum(nums.toIntArray())
    for (i in bebra){
        print("$i,")
    }

    val accounts = arrayOf(intArrayOf(10,5,3), intArrayOf(6,7,4))
    println(maximumWealth(accounts))

    val fizubizu = fizzBuzz(15)
    for (i in fizubizu.indices){
        print("${fizubizu[i]},")
    }

    println("\n"+numberOfSteps(14))

    val listNode1 = ListNode(1)
    val listNode2 = ListNode(2)
    val listNode3 = ListNode(3)
    val listNode4 = ListNode(4)
    val listNode5 = ListNode(5)
    listNode1.next = listNode2
    listNode2.next = listNode3
    listNode3.next = listNode4
    listNode4.next = listNode5

    println(canConstruct("ddd","d"))
}