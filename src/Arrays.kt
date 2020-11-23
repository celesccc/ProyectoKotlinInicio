fun main (args: Array<String>) {

// Arrays
    val myArrayDeEnteros = arrayOf<Int>(10, 20, 30) //Tipando
    val myArrayDeBool = booleanArrayOf(true, true, false) //Llamando a una función concreta
    val myArrayDeString = arrayOf("Juan", "Maria", "Samuel") //Sin tipar

// Array de Enteros
    println(myArrayDeEnteros[0]) //Imprimo el dato directamente
    println("Resultado del array de enteros, pos 0: ${myArrayDeEnteros[0].toString()}")

//Array de booleanos
    println(myArrayDeBool[0])
    println("Resultado de array de bool: ${myArrayDeBool[0].toString()}")

//Array de Strings
    println(myArrayDeString[0])
    println("Resultado de array de String: ${myArrayDeString[0]}")
}

