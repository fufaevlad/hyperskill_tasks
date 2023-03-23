// Вам дано a Listстрок и a Stringна входе.
// Подсчитайте количество вхождений Stringв List.

fun solution(strings: List<String>, str: String): Int {
    var counter = 0
    for (i in strings) {
        if (i == str) {
            counter++
        }
    }
    return counter
}

// Варианты решения

fun solution(strings: List<String>, str: String) = strings.count(str::equals)

fun solution(strings: List<String>, str: String): Int = strings.count { it == str }
