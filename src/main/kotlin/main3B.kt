import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking



fun main() {


    runBlocking { // this: CoroutineScope
        launch {
            delay(200L)
            println("Tarea del runBlocking")
        }
        //con el coroutinescope esperara a que acabe todo lo que se enecuentre dentro
        coroutineScope { // Definimos un Scope, de aquí no salimos hasta que todas las corrutinas interiores hayan acabado.
            launch {
                delay(500L)
                println("Tarea del launch del coroutine scope")
            }

            delay(100L)
            println("Tarea del coroutine scope")
        }

        println("CoroutineScope superado")
    }
    println("runBlocking superado")

}

