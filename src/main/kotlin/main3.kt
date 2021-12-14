import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    println("Empiezo main3")
    //lanza este trozo de codigo, por poner runblocking no estamos lanzando como tal una corutina
    runBlocking {
        println("Entro en el blocking")
        delay(3000)
        println("Salgo del blocking")
    }

    println("Main no ha seguido a lo suyo")

    println("Termina")
}
