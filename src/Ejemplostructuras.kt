
fun main(){

    //Arrays
    val myArrayEnteros = arrayOf<Int>(10,20,30)
    val myArrayBool= booleanArrayOf(true, false, false)
    val myArrayString = arrayOf("Juan", "María", "Samu")

    //Listas
    val list = mutableListOf<Int>(1,2,3)
    //Convierto los arrays en una lista:
    val lista2 = myArrayBool.asList()
    val lista3 = myArrayEnteros.asList()
    val lista4 = myArrayString.toList()

    println("Uso de asList ")
    val arr1 = arrayOf(1,2,3)
    val l1 = arr1.asList()
    arr1[0]=4
    println(l1)

    println("Uso de toList")
    val arr2 = arrayOf(1,2,3)
    val l2 = arr2.toList()
    arr2[0]=4
    println(l2)


    //Crear istas usando funciones:
    val listaF = MutableList(99) {pos -> if (pos%2 ==0) pos *-1 else pos}

    val listaF2 = mutableListOf(1,2,"a",2.1)

    val array = arrayOf("Hola", "Adios")
    val listaF3 = mutableListOf(listaF, listaF2, array, "tres")

    //Obtener elementos de una lista
    //elementAt(), first(), last()

    //Si el tamaño de la lista es menor que el índice especificado se lanza una excepción
    //Al contrario que en Java se puede utilizar dos funciones que evitan estas excepciones

    println("Obtener elementos de una lista")
    val numeros = listOf(1,2,3,4)
    println(numeros.get(0))
    println(numeros[0])
   // println(numeros.get(5)) --> Para evitar una excepción:
    println(numeros.getOrNull(5))
    println(numeros.getOrElse(5,{it}))

    //Obtener partes de una lista
    val numeros2 = (0..13).toList()
    println(numeros2.subList(3,6))


    //Búsquedas
    // 1. Búsqueda lineal
    val numeros3 = listOf(1,2,3,2,5)
    println(numeros3.indexOf(2))
    println(numeros3.lastIndexOf(2))

    // 2. Busqueda con predicado
    val numeros4 = mutableListOf(1,2,3,4)
    println(numeros4.indexOfFirst { it > 2 })

    println(numeros4.indexOfLast { it % 2 == 1 })

    // 3. Búsquedas binarias
    println("Búsqueda binaria en una lista")
    val numeros5 = mutableListOf("one", "two", "three", "four")
    numeros5.sort()
    println(numeros5)
    println(numeros5.binarySearch ( "two" ))
    println(numeros5.binarySearch ("z"))
    println(numeros5.binarySearch("two",0,2))

    //Añadir elementos
    val numeros6 = mutableListOf("one", "five", "six")
    numeros6.add(1, "two")
    println(numeros6)
    numeros6.addAll(2, listOf("three", "four"))
    println(numeros6)


    val numeros7 = mutableListOf("one","five","three")
    numeros7[1] = "two"
    println(numeros7)


    // Bucles avanzados para recorrer listas/arrays
    val numeros10 = mutableListOf(1,2,3,4,3)

    for (index in numeros10.indices){
        println("$index, ")
    }

    println("Obtener índice y elemento")
    val numeros11 = mutableListOf(1,20,300,4000,5000)

    for ((index,element) in numeros11.withIndex())
        println("$index, $element")
}