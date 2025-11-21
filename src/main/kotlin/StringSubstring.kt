package org.example

/**
 * Contains a function to check if the characters of the second string are a substring of the first string.
 * Does not use String.contains.
 */

object StringSubstring {

    // Returns true if subStr is a substring of mainStr (exact consecutive characters).
    fun isSubstring(mainStr: String, subStr: String): Boolean {
        if (subStr.isEmpty()) return true
        if (subStr.length > mainStr.length) return false

        val n = mainStr.length
        val m = subStr.length

        for (i in 0..(n - m)) {
            var match = true
            for (j in 0 until m) {
                if (mainStr[i + j] != subStr[j]) {
                    match = false
                    break
                }
            }
            if (match) return true
        }
        return false
    }
}

fun main() {
    println("Testing isSubstring:")
    println(StringSubstring.isSubstring("this is a test", "is a")) // Expected: true
    println(StringSubstring.isSubstring("abcd", "bd"))            // Expected: false
    println(StringSubstring.isSubstring("hello", ""))             // Expected: true
}