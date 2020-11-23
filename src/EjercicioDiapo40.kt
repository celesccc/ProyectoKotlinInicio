
fun main(){

    val lista = listOf("Hola,", 2, 3, "¿", 0.1, "Qué", 1, "tal", 0.9, "?")
    var total = 0.0
    var cad = ""

    lista.forEach {i ->
        when(i){
            is String -> cad = cad + " $i"
            is Double -> total += i
            is Int -> total += i
        }
    }

    println("Strings concatenados: $cad")
    println("Suma de los números: $total")
}