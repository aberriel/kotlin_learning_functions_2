fun main() {
    /*
    Loop infinito:
    while(true) {
        println("Anselmo")
    }
    */

    /*
    Nunca irá executar:
    while(false) {
        println("Anselmo")
    }
     */

    var index: Int = 0
    while(index < 100){
        println(index)
        index++

        if(index == 50) {
            break
        }
    }
}