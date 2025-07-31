package org.example

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    val ransomNoteArray = ransomNote.toCharArray()
    val magazineArray = magazine.toCharArray()
    var checkChar: Char
    var chooseChar: Char
    var inWordCounter = 0
    for(i in 0..ransomNote.length-1){
        checkChar = ransomNoteArray[i]
        for (j in 0..magazine.length-1){
            chooseChar = magazineArray[j]
            if(checkChar == chooseChar){
                inWordCounter++
                magazineArray[j] = ' '
                break
            }
        }
    }
    return ransomNote.length == inWordCounter
}