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

    println(numberOfSteps(14))
}