val romanMap = mapOf(
    'I' to 1,
    'V' to 5,
    'X' to 10,
    'L' to 50,
    'C' to 100,
    'D' to 500,
    'M' to 1000
)

fun main() { // Just for testing - not submitted
    val string = "MCMXCIV" // Testcase

    val result = romanToInt(string)
    print(result)
}

fun romanToInt(s: String): Int {
    var yearAsInt = 0
    var prevChar = '0'

    s.forEach { char ->
        if (romanMap.containsKey(char)) {
            yearAsInt += romanMap[char]!!
        }

        if (prevChar == 'I' && (char == 'V' || char == 'X')) {
            yearAsInt -= 2
        } else if (prevChar == 'X' && (char == 'L' || char == 'C')) {
            yearAsInt -= 20
        } else if (prevChar == 'C' && (char == 'D' || char == 'M')) {
            yearAsInt -= 200
        }

        prevChar = char
    }

    return yearAsInt
}