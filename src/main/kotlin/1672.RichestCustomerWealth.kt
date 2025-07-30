package org.example

fun maximumWealth(accounts: Array<IntArray>): Int {
//    var max = 0
//    var sum : Int
//    accounts.forEachIndexed { index, ints ->
//        sum = 0
//        ints.forEachIndexed { i, num ->
//            sum += num
//        }
//        if (sum > max) max = sum
//
//    }
    return accounts.maxOf{ it.sum() }
}