fun soma(a: Int, b: Int): Int {
    return a + b
}

fun hello() {
    println("Olá!")
}
fun main() {
    hello()
    println(soma(10, 20))
    println(div(10.0f, 2.5f))

    val name = "Adriano"
    println(name.length)
    println(name[0])
    println(name.compareTo("Santana"))
    println(name.startsWith("Ad"))
    println(name.substring(2))
    println(name.replace('a', 'k', true))
}

fun div(a: Float, b: Float) = a/b

