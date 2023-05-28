fun main(){
    /* Función del sistemas a la que se le pasa una cadena de texto y
     * la muestra por consola/terminal
     */

    // Hola mundo
    println("Hola, Kotlin!")

    //-- Variables
    // Kotlin es un lenguaje de programación fuertemente tipado.
    var myString = "Esto es una cadena de texto"
    myString = "Aquí cambio el valor de la cadena de texto"
    // myString = 6 ERROR
    println(myString)

    /* Esto es redundante, el id lo reconoce y nos sugiere eliminar el
     * tipado, aunque a veces puede ser útil definir el tipo de esta forma
     */
    var myString2: String = "Esta es otra cadena de texto"
    println(myString2)

    var myInt = 6
    myInt = myInt + 1
    println(myInt)
    println(myInt - 1)
    println(myInt)

    var myInt2: Int = 5
    println(myInt2)

    var myDouble = 6.5 //-- Tipo double es como float en python
    println(myDouble)
    // myDouble = 6 ERROR
    myDouble = 6.0 //-- SIEMPRE debe llevar parte decimal
    println(myDouble)

    var myDouble2: Double = 6.5
    var myFloat: Float = 6.5f //-- para que sea tipo float hay que tiparlo y pasarle la 'f' al final

    //-- SI SE PUEDE EVITAR, NO DEBEMOS TIPAR

    var myBool = false
    myBool = true
    println(myBool)
    //----------------hasta-aqui-los-tipos-de-datos-basicos------------------

    //-- Constantes
    val myConst = "Mi propiedad constante"
    // myConst = "Mi nueva propiedad constante" ERROR => una constante NO puede modificarse

    //-- Control de flujo

    //-- If ... elseif ... else
    myInt = 100
    myString = "Hola"
    if (myInt == 7 && myString == "Hola"){
        println("El valor es 7")
    }else if(myInt == 10 || myString == "Hola"){
        println("El valor es 10")
    } else{
        println("El valor es distinto de 7 y de 10")
    }

    //-- Estructuras

    //-- Lista
    var myList = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes")
    println(myList)
    println(myList[1])
    /* En este punto si quisieramos añadir un elemento a la lista no seria posible.
       Esto se debe a que en Kotlin las estructuras por defecto se crean de forma
       inmutable. Si se quiere crear una lista que pueda mutar se debe definir como
       se ve a continuacion
     */
    var myMutableList = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes")
    println(myMutableList)
    myMutableList.add("Lunes")
    println(myMutableList)

    //-- Sets
    /* Estructura no ordenada, agil, rapida y optima
    *  Se usa cuando queremos guardar muchos datos y nos da igual el orden
    * y cuando no queremos dar soportes repetidos.
    * Los Sets NO admiten duplicados.
    */
    var mySet = setOf("Cris", "Taboada", "@Borahae798", "Cris")
    println(mySet)

    //-- Maps
    /* Estructura compleja no ordenada, que nos permite guardar diferentes propiedades
    *  de tipo clave:valor
    */
    val myMap = mutableMapOf("Cris" to 25, "Jin" to 30, "Jungkook" to 26)
    println(myMap["Jin"])
    // Añadir a alguien mas
    myMap["Jimin"] = 28


    //-- Bucles

    //-- for
    for (value in myList){
        println(value)
    }

    for (value in mySet){
        println(value)
    }

    for (value in myMap){
        println(value)
    }

    //-- while
    var myCounter = 0
    while (myCounter < myList.count()){
        println(myList[myCounter])
        myCounter++
    }

    //-- Opcionales
    /* Dar la capacidad a una variable pueda llegar a ser null,
    * por el motivo que sea.
    * Para hacer esta opcionalidad de que un tipo de dato que tenemos pueda tomar
    * el valor del tipo de dato o por otro lado tb ser nulo, simplemente debemos añadir
    * un interrogante al lado de la definición del tipo de dato.
    */
    var myOptional: String? = null
    println(myOptional)
    myOptional = "Mi cadena de texto opcional"
    println(myOptional)
}