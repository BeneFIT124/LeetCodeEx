package org.example

fun runningSum(nums: IntArray): IntArray{
    return nums.apply {
        var sum = 0
        this.forEachIndexed { i, value ->
            sum += value
            this[i] = sum
        }
    }
}