package org.example

fun numberOfSteps(num: Int): Int{
    var answer = 0
    var nums = num
    while (nums != 0){
        when{
            nums%2 == 0 -> nums /= 2
            else -> nums -= 1
        }
        answer++
    }
    return answer
}