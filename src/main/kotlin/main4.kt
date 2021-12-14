import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random



fun main() {
    funcionErronea()
}
//con el launch lanzamos de verdad la corutina, cuando hacemos un runblockin no estamos lanzando nada hasta que hagamos un launch
fun funcionErronea() {
    val c = AtomicInteger()
    //GlobalScope.launch en el caso de tener esto no hara nada ya que no espera, lanzara las corutinas pero seguira de largo

    //
    runBlocking {

        for (i in 1..100)
            launch {
                delay(1000L)
                val sumar = Random.nextInt(0, 9)
                println("Voy a sumar $sumar")
                c.addAndGet(sumar)
            }
    }
    // Valor erroneo, hay valores que no se han terminado de sumar
    println("el resutlado es ${c.get()}")
}

