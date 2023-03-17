const val HUNDRED = 100

fun main(){
    val cgList = listOf('c','g')
    val inputSeqDNA: MutableList<Char> = mutableListOf()
    val a = readln().lowercase()
    var cgCounter = 0
    for (i in 0 until a.length){
        inputSeqDNA.add(a[i])
    }
    for (i in 0 until inputSeqDNA.size)
        if(cgList.contains(inputSeqDNA[i])) {
            cgCounter++
        }
    val ans: Double= cgCounter.toDouble()/inputSeqDNA.size*HUNDRED
    println(ans)
}
