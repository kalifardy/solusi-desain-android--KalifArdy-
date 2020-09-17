fun hello(name: String): String {
    val user = "Kalif!"
    val noString=""

    println("Hello "+ user)

    if(noString=="a"){
      println(noString) //name berisi string kosong
    }else{
        println("Hello "+ name)
    }

    return "Hello " + name// name tidak memiliki nilai
}

fun main(args: Array<String>) {
    println(hello("World!"))
}

