/*definir una palabra buscada: var palabra = "Ahorcado" directamente por código.
Durante el juego. tendrás que mostrar una _, por cada letra que todavía no ha sido descubierta.
Se pregunta al usuario que diga una letra. Si esa letra está en la palabra, entonces se muestra, esa letra:
Ejemplo, el usuario pone "a", se muestra "A____a__". No tengas en cuenta mayúsculas y minúsculas.
Se termina cuando se han encontrado todas las palabras.
También debes mostrar el número de intentos que se han utilizado.
No debes permitir que el usuario introduzca dos veces la misma letra.
 */

import java.util.Scanner

fun main(){

    val palabra = "Celeste".toUpperCase()
    val oculta = Array(palabra.length) {"-"}
    oculta.forEach {
        print("$it ")
    }
    println()

    val letrasUsadas: MutableList<String> = mutableListOf()
    var error = 0
    var acierto = 0
    /*do{
        val letra = readCharFromKeyboard()

        if (letra in palabra){
            acierto++
            for (i in palabra.indices){
                if (letra == palabra[i].toString())
                    oculta[i] = letra
            }
        }
    }while()*/
}
fun readCharFromKeyboard(): Char {
    var result: Char?
    val keyboardReader = Scanner(System.`in`)
    do {
        val selectedOption = keyboardReader.nextLine()
        result = if (selectedOption.length == 1) selectedOption[0] else null
    } while (result == null)
    return result
}