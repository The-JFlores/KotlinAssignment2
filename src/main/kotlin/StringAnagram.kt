package org.example

/**
 * StringAnagram.kt
 * Contains function to determine if two single words are anagrams.
 */



object StringAnagram {

    // Returns true if word1 and word2 are anagrams (case-insensitive, letters only).
    fun areAnagrams(word1: String, word2: String): Boolean {
        val w1 = word1.lowercase().filter { it.isLetter() }
        val w2 = word2.lowercase().filter { it.isLetter() }
        return w1.toCharArray().sorted() == w2.toCharArray().sorted()
    }
}
fun main() {
    println("Testing areAnagrams:")
    println(StringAnagram.areAnagrams("dusty", "study"))  // Expected: true
    println(StringAnagram.areAnagrams("Hello", "Olelh"))  // Expected: true
    println(StringAnagram.areAnagrams("abc", "abx"))      // Expected: false
}