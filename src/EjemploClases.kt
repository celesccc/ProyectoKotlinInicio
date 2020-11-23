class Cliente // 1
class Contacto (val id: Int, var email: String) //2

fun main(args: Array<String>){

    val cliente = Cliente() //3
    val contacto = Contacto(1, "cecuer@gmail.com") //4

    println(contacto.id) //Accedemos a la propiedad id
    contacto.email = "nuevoemail@gmail.com" // Modificamos el valor del atributo/propiedad email



}

// 1. Declarar una clase Cliente sin atributos ni constructores.
// Kotlin crea siempre un constructor por defecto de forma automática!!!!

// 2. Declaramos una clase Contacto cno dos atributos: Una const id y una var email
// y a la vez un constructor con dos parámetros

// 3. Creamos una instancia de la clase Cliente a través del constructor por defecto
// Ojo, no hay new!

// 4. Instancia de l Contacto
