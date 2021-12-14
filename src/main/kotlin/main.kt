import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    println("Empiezo main")
    // Start a coroutine
    //Globalscope es donde se ejecutara la corutina, no es que sea en segundo plano, en si no esta ligado a la app
    //va a lo suyo
    GlobalScope.launch {
        println("Corrutina a dormir")
        delay(1000)
        println("Corrutina despierta")
    }
    println("Main sigue a lo suyo")
    Thread.sleep(2000) // wait for 2 seconds
    println("Termina")
}


