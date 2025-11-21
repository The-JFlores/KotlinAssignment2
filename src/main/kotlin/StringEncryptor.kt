package org.example

/**
 * StringEncryptor.kt
 * Contains a function to encrypt a given string by shifting each letter by a key (Caesar cipher).
 * Non-letter characters remain unchanged.
 */



object StringEncryptor {

    // Encrypts the input text by shifting letters by the provided key.
    fun encryptWithCaesarCipher(text: String, key: Int): String {
        val result = StringBuilder()
        val normalizedKey = (key % 26 + 26) % 26  // Normalize key between 0 and 25

        for (char in text) {
            if (char.isLetter()) {
                val base = if (char.isUpperCase()) 'A' else 'a'
                val shifted = ((char - base + normalizedKey) % 26 + base.code).toChar()
                result.append(shifted)
            } else {
                result.append(char)  // Keep non-letters unchanged
            }
        }
        return result.toString()
    }
}

fun main() {
    println("Testing encryptWithCaesarCipher:")
    println(StringEncryptor.encryptWithCaesarCipher("abc xyz", 1))   // Expected: bcd yza
    println(StringEncryptor.encryptWithCaesarCipher("Hello, Z!", 2)) // Expected: Jgnnq, B!
}