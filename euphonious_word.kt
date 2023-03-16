fun main() {
    val vowList = mutableListOf('a', 'o', 'e', 'i', 'u', 'y')
    var vowCounter = 0
    var consCounter = 0
    var v = 0
    var c = 0
    val a = readln()
    val input: MutableList<Char> = mutableListOf()
    for (i in 0 until a.length) {
        input.add(a[i])
    }

    for (i in 0 until input.size) {
        if (vowList.contains(input[i])) {
            c = 0
            v++
            if (v > 2) {
                vowCounter++
                v = 1
            }
        } else {
            v = 0
            c++
            if (c > 2) {
                consCounter++
                c = 1
            }
        }
    }
    println(vowCounter + consCounter)
}
