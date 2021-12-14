import kotlinx.coroutines.*

fun main(){
    runBlocking {
        launch {
            //el lazy segun hagamos el await se ejecutara
            val contenido = async(start = CoroutineStart.LAZY) {  // Similar al anterior pero en este caso los 1000 no se empiezan
                    // hasta que hacemos el await.
                    delay(1000)
                    "Hola"
                }
            //delay(3000)
            println("Estoy listo para imprimir pero \"a\" aún está vacia por lo que toca esperar")
            println(contenido.await())
            println("Impreso!")

        }
        Thread.sleep(5000)

        //en el caso 5 cuando hacemos un delay de 3000 veremos
        //las funciones layz solo se ejecutaran cuando sean llamadas por asi decirlo se ejecutara cuando se necesite
    }
}