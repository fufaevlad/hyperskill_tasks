Перебрать каждый второй элемент списка в цикле и найти индекс первого слова, начинающегося с T.

Гарантируется, что хотя бы одно слово с нечетным индексом начинается с T.

fun solution(names: List<String>): Int {
    var counter: Int = 0
    for (i in 1..names.lastIndex step 2) {
        for (j in 0 until names[i].length) {
            if (names[i][j] == 'T') {
                counter = i
                break
            }
        }
        if (counter > 0) {
            break
        }
    }
    return counter
}




Варианты решения 

fun solution(names: List<String>) =
    names.withIndex().first { it.index % 2 == 1 && it.value.startsWith("T") }.index

---------------------------
  
  fun solution(names: List<String>): Int {
    return names
        .withIndex()
        .first { it.value.startsWith("T") && it.index % 2 != 0 }
        .index
}

  
  -------------------------
