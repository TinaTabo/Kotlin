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
}