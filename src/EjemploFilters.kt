fun main(){

    val colores = mutableListOf("Rojo", "Azul", "Verde", "Narajan", "Amarillo")

    val listaAMayus = colores.filter {it.contains("A")}
    println("Lista a mayus: $listaAMayus")

    //Otra forma:
    val lista4Letras = colores.filter {it.length==4}
    println("Lista 4 letras: $lista4Letras")

    //Aplicarlos filstros sobre arrays
    var arrayListaMeses: List<String> = arrayListOf("Enero", "Feb", "Marzo")
    //Para obtener el resultado del mes de enero como una lista
    var listaMeses : List<String> = arrayListaMeses.filter { s -> s == "Enero" }
    //Lo obtenemos como un String
    var mes:String = arrayListaMeses.filter{ s -> s == "Enero"}.single()
    var mes2:String = arrayListaMeses.single{s -> s == "Enero"}

    // Para evitar realizar copias de listas se utiliza "lazys" que mantiene,
    // la lista original sin realizar copia
    var lazyMayus = colores.asSequence().filter{it.contains("A")}
    println("Lazy Mayus: $lazyMayus")
    //Qué retorna? ¿Puedo imprimir la lista tal y como está?
    lazyMayus.forEach { print("{$it}") } //Forma correcta de imprimir los elementos
    

}