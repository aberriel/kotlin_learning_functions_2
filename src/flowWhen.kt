fun operation(a: Int, b: Int, c: String) {
    // O Wheń tá mais para um Switch/Case
    /*
    when(c) {
        "Sum" -> return a + b
        "Diff" -> return a - b
        "Product" -> return a * b
        else -> return -1
    }
     */

    when {
        a > 0 && b > 0 -> {
            println("Variáveis a e b positivas")
        }
    }

    // range: Intervalo de valores
    when (a) {
        in 1..99 -> {
            println("Século")
        }
    }
}

fun main() {
    operation(10, 10, "Sum")
    operation(20, 5, "Diff")
}