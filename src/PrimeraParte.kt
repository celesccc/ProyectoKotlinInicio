fun main (args: Array<String>){

    //Variables
    var variableInt: Int
    var variableLong: Long = 10

    //Constantes
    val variable = 1 //tipo Int

    // variableLong = variable --> Error de compilación
    variableLong = variable.toLong() //Casting

    //Comprobar el tipo de dato
    if (variable is Int)
        println("Es tipo entero")
    else println("No es tipo entero")

    // Protección de las variables contra los NULL
    // Kotlin no permite la asignación a NULL, para poder asignar una var a null -->
    var nuncaNull: String = "Esta var nunca podrá ser null"
    // nuncaNull = null --> No se puede hacer. ERROR.
    var nullable: String? = "Sí puede ser null"
    nullable = null //Sí se puede! :)
    var inferredNonNull = "No defino tipo, el compilador asume un valor no null"
    //inferredNonNull = null --> Error de compilación


    fun strLength(notNull: String): Int {
        print(notNull.length)
        return notNull.length
    }
    strLength(nuncaNull)
    // strLength(nullable) --> Error compìlación pasando un null a un parámetro que no es null


    fun describeString(puedeSerString: String?): String{ //1
        if(puedeSerString != null && puedeSerString.length > 0) //2
            return "Longitud del String: ${puedeSerString.length}"
        else
            return "Valor vacío o null" //3
    }
    // 1: Es una función que toma un String que puede ser Null y retorna un texto
    // 2: Si el String no es null y no es vacío, retorna la longitud
    // 3: En otro caso retorno el texto Valor vacío o null
    var resultado = describeString(nullable)
    println(resultado)

}

