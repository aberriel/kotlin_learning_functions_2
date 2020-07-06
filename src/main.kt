// Função em uma linha
fun hellp(name: String) = "Olá, $name"

// OBS: Não existe operador ternário em Kotlin mas dá pra fazer if/else inline

/*
    Operadores lógicos:

    - Operador AND: &&
        + Ex: exp1 && exp2
    - Operador OR: ||
        + Ex: exp1 || exp2
    - NOT: !
        + Ex: !exp1

    OBS: o AND tem sempre prioridade sobre o OR

    Ex:
    if((exp1 && exp2) || exp3 || exp4) {
        // Código
    }

    No caso acima, o AND será executado primeiro mesmo que não tivesse sido posto dentro
    dos parênteses
 */

fun address(street: String = "", city: String, state: String, postalCode: String, number: Int = 0) {
}

fun media(vararg notas: Float) {
    if(notas.isNotEmpty()) {
        var soma = 0f
        for(nota in notas) {
            soma += nota
        }
        var mediaCalculada = soma / notas.size
        println("A média é ${mediaCalculada}")
    }
}

// Tipo T com vargarg
// Função aceitando número arbitrário de parâmetros de tipos arbitrários
fun <T> media2(vararg valores: T) {
    for(valor in valores) {
        println(valor)
    }
}

fun calculaBonus(cargo: String, salario: Float): Float {
    // Gerente Júnior, Gerente Sênior, Coordenador
    return if (cargo == "Coordenador") {
        salario * 0.2f
    } else if (cargo == "Gerente Júnior") {
        salario * 0.5f
    } else {
        salario * 2
    }
}

fun maiorDeIdade(idade: Int): Boolean {
    return idade >= 18
}

fun checaMaiorDeIdade(){
    println("Testando o maiorDeIdade")
    println(maiorDeIdade(10))
    println(maiorDeIdade(18))
    println(maiorDeIdade(50))
}

fun main() {
    val valor = 10
    val str = if(valor == 10) "Sim" else "Não"

    // Operador elvis: ?
    // O operador elvis acompanha o tipo da variável, indicando que ela pode ser nula
    // OBS: Variável só declarada e não definida é NULA
    val test: Int? = null
    val op: Int = test ?: 100
    println("op: $op")

    //println(calculaBonus("Caixa", 1000f))
    //println(calculaBonus("Coordenador", 1000f))
    //println(calculaBonus("Gerente Sênior", 1000f))
    //address(city = "Rio de Janeiro", state = "RJ", postalCode = "22")

    media(8f, 9f, 7f)
}
