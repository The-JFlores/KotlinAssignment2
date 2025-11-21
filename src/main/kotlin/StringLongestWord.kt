
package org.example

/**
 * Contains a function to return the longest word in a given string.
 */



object StringLongestWord {

    // Returns the longest word from the sentence. Splits by common delimiters.
    fun longestWord(sentence: String): String {
        val tokens = sentence.split(Regex("[\\s,.!?:;\"()\\[\\]{}]+")).filter { it.isNotEmpty() }
        var longest = ""
        for (word in tokens) {
            if (word.length > longest.length) {
                longest = word
            }
        }
        return longest
    }
}

fun main() {
    println("Testing longestWord:")
    println(StringLongestWord.longestWord("Find the longest word in this sentence.")) // Expected: sentence
    println(StringLongestWord.longestWord("One two threeeeee four"))                  // Expected: threeeeee
}
