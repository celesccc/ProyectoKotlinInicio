fun main(args: Array<String>) {

    var numero: Int = 10

    //var numero2 : String? = readLine()
    // var num = numero2?.toInt()

    // Uso básico del if
    if (numero == 0)
        println("El valor del número es 0")
    else
        println("$numero es distinto de 0")

    // Uso tradicional
    var a = 1
    var b = 2
    var max = a

    if (a > b) max = b

    //Con else
    var max2: Int
    if (a > b)
        max2 = a
    else
        max2 = b

    //Como si fuera una expresión
    var max3 = if (a > b) a else b
    
}