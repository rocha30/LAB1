/*
fun DecimalaBinario(decimal: Int ): String{
    return Integer.toBinaryString(decimal)
}

fun main(){
    println("Introduce un valor en decimal: ")
    val input = readLine()
    val decimal = input?.toIntOrNull()


    if(decimal != null){
        val binary = DecimalaBinario(decimal)
        println("El número $decimal en binario es: $binary  ")
    }
    else {
        println("introduce un núemero valido")
    }
}

 */

/*

fun isPalindrome(word: String): Boolean {
    val cleanedWord = word.toLowerCase()
    return cleanedWord == cleanedWord.reversed()
}


fun hasAtLeastTwoDistinctVowels(word: String): Boolean {
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    val distinctVowels = word.toLowerCase().filter { it in vowels }.toSet()
    return distinctVowels.size >= 2
}


fun startsWithConsonant(word: String): Boolean {
    val consonants = ('a'..'z').toSet() - setOf('a', 'e', 'i', 'o', 'u')
    return word.isNotEmpty() && word[0].toLowerCase() in consonants
}


fun main() {
    println("Introduce varias palabras separadas por espacios: ")
    val input = readLine()
    val words = input?.split(" ") ?: listOf()


    var palindromeCount = 0
    var distinctVowelsCount = 0
    var startsWithConsonantCount = 0


    for (word in words) {
        if (isPalindrome(word)) palindromeCount++
        if (hasAtLeastTwoDistinctVowels(word)) distinctVowelsCount++
        if (startsWithConsonant(word)) startsWithConsonantCount++
    }


    println("Cantidad de palabras palíndromas: $palindromeCount")
    println("Cantidad de palabras con al menos 2 vocales distintas: $distinctVowelsCount")
    println("Cantidad de palabras que inician con una consonante: $startsWithConsonantCount")
}


 */