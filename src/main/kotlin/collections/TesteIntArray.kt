package one.digitalinnovation.collections

fun main() {
    val vallues = IntArray( size = 5)
    vallues[0] = 1
    vallues[1] = 7
    vallues[2] = 6
    vallues[3] = 3
    vallues[4] = 2

    for (valor in vallues){
        println(valor)
    }

    println("___________________________")
    vallues.forEach {
    println(it)
    }

    println("___________________________")
    for (index in vallues.indices) {
        println(vallues[index])
    }

    println("___________________________")
    vallues.sort()
    for (valor in vallues) {
        println(valor)
    }
}