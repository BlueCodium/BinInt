import java.util.Scanner

fun main () {
    val diviseur: Int = 2 //Diviseur
    var quotient: Int? = null //Quotient et Reste
    var reste: Int? = null //Reste
    var d: Int = 0 //Dividende (de base)
    var tab = mutableListOf<Int>()
    var a = Scanner(System. `in`)
    print("Enter a number: ")
    println(" ")
    var dividende:Int = a.nextInt()

    d = dividende
        while (dividende > 0) {
            quotient = dividende / diviseur // q = a / b
            reste = dividende % diviseur // r = a % b
            println("$dividende / $diviseur") //a / b
            println("Quotient: $quotient") // => q
            println("Reste: $reste") // => r
            tab.add(reste)  
            dividende = quotient
        }
    tab.reverse()
    for (tab in tab) {
        print(tab)
    }
        println("")
}