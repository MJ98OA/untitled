import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() {
    println("Empiezo main2")
    runBlocking {
        println("Entro en el blocking")
        println("Lanzo corrutina1")

        GlobalScope.launch {
            delay(1000)
            println("Termino corrutina1")
        }
        println("Lanzo corrutina2")

        GlobalScope.launch {
            delay(4000)
            println("Termino corrutina2")
        }
        println("Empiezo a dormir")
        delay(3000)
        println("Dejo de dormir")


        println("Salgo del blocking")
    }

    println("Main no ha seguido a lo suyo")


    Thread.sleep(5000) // wait for 2 seconds

    println("Termina")
}
