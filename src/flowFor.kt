fun main() {
    // loop for
    val name = "Anselmo Lira"

    /*
        String nada mais é do que uma cadeia de caracteres, isto é, se comporta como
        uma lista.
     */

    for (c in name) {
        print("$c ")
    }
    print("\n")

    /*
        Para contadores, o step permite pular x ciclos.
        Assim, se temos step 2, a cada 2 ciclos eu executo.
     */
    for (i in 0..100 step 5){
        if (i != 80)
            print("$i ")
    }
    print("\n")

    for (j in 100 downTo 1 step 5) {
        print("$j ")
    }
}