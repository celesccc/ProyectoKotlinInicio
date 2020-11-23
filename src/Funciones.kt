fun main(args: Array<String>){

    printMessageWithPrefix("Hola")
    print("Hola 2")

}

fun printMessage(message: String){
    println("$message")
}



//Definimos una función con parámetro opcional y un valor por defecto asignado
fun printMessageWithPrefix(message:String, prefix:String="Info"){
    println("[$prefix] - $message");

    // Parámetro obligatorio es el que no está inicializado,
    // y el opcionla es el que está inicializado
}

//Funciones Infix ???????

