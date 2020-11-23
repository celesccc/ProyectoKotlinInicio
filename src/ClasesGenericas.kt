class PilaVariable<E> (vararg items: E){ // 1
    private val elements = items.toMutableList() //2

    fun push(element: E) = elements.add(element) //3

    fun peek():E = elements.last()
    fun pop():E = elements.removeAt(elements.size-1)
    fun isEmpty() = elements.isEmpty()
    fun size() = elements.size
    override fun toString() = "PilaVariable(${elements.joinToString()})"

}

fun <E> pilaVariable(vararg elements:E) = PilaVariable(*elements)

fun main(){

    val pila = pilaVariable(0.62, 4.14, 2.7)
    println(pila)
}



// 1. Definimos una clase genérica donde E es el tipo de dato genérico.
// 2. Defino como atributo los miembros  de la pila
// 3. Dentro de la clase genérica, el tipo genérico E puede ser utilizado

