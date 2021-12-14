import kotlinx.coroutines.*
import java.util.concurrent.atomic.AtomicInteger
import kotlin.random.Random



fun main() {
    runBlocking {
        //funcionSinDeferred()
        funcionConDeferred()
    }

}
//el problema principal es que aqui no obtenemos todos los resultados una opcion seria ponerle un runblocking al for pero lo podemos solventar con los deferred
suspend fun funcionSinDeferred()= coroutineScope {
    println("Entro")

    launch {
        println("Entro1")
        val list = mutableListOf<Int>()
        for (i in 1..100) {
            GlobalScope.launch {
                list.add(Random.nextInt(0, 9))
            }
        }
        println("El resultado sin Deferred es una lista de ${list.size} elementos con \n$list ")
    }


}


suspend fun funcionConDeferred() = coroutineScope {

    launch {
        val listOfDeferred = mutableListOf<Deferred<Int>>()
        for (i in 1..100) {
            val a = async {
                Random.nextInt(0, 9)
            }
            listOfDeferred.add(a)
        }

        println("El resultado sin Deferred es una lista de ${listOfDeferred.awaitAll().size} elementos con \n${listOfDeferred.awaitAll()} ")
    }
    Thread.sleep(5000) // wait for 5 seconds. Para que tenga tiempo de escribir el resutlado.

}


