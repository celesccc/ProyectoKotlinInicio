import java.util.*

fun main(args: Array<String>){

    val aleatorio:Int = getRandomNumber(0..9)

    do{
        println("Ingrese numero entre 0 y 9")
        val num = readIntFromKeyboard()
        if (num < 0 || num > 9)
            println("$num no es un numero valido. Pruebe otra vez")
        else if (aleatorio < num)
            println("El numero buscado es mas pequeño")
        else if (aleatorio > num)
            println("El numero buscado es mas grande")
    }while(num != aleatorio)

    println("Enhorabuena! El numero era $aleatorio")
}

fun readIntFromKeyboard(): Int {
    var result: Int?
    val keyboardReader = Scanner(System.`in`)
    do {
        val selectedOption = keyboardReader.nextLine()
        result = try {
            selectedOption.toInt()
        } catch (e: NumberFormatException) {
            println("Lo que has introducido no es un número.")
            null
        }
    } while (result == null)
    return result
}

fun getRandomNumber(rango: IntRange): Int {
    return rango.random()
}