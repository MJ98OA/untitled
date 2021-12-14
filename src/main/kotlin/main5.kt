import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main(){
    //esto lo podemos cambiar por un runblocking ahorrandonos el 5000 ya que esperara a que acabe
    GlobalScope.launch {
        //el async seria lo mismo que un launch si la landa del launch no devuelve nada
        //la del asyn devuelve algo seria como una landa
        //el async el tipo que devolvamos aqui si devolvemos un string devolvera un deffered que
        //tendra el metodo await que obligara a esperar al scoper hata tener el resultado del async
        val contenido = async {
            delay(1000)
            "Hola"
        }
        //delay(3000)
        println("Estoy listo para imprimir pero \"contenido\" aún está vacío por lo que toca esperar")
        println(contenido.await())
        println("Impreso!")

    }
    println("Fuera del globalscope")
    Thread.sleep(5000)

}