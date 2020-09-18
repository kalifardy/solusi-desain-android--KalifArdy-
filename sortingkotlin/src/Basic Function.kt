fun hello(name: String = "Hello"): String {
    return "Hello, $name!"
}

fun main () {
    println(hello("Kalif ardy"))
    println(hello())
}
