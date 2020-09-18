fun stringManipulation(kataAsli: String, kataModifikasiBerurutan: List<String>): String {

    var kataBenar = String()

    for (value in kataModifikasiBerurutan) {
        if (value.toLowerCase() in kataAsli) {
            kataBenar += "$value "
        }
    }

    return kataBenar;
}

fun main() {
    var kata: String = "cokefriesburgerchickenpizzasandwichonionringsmilkshake"
    var urutan: List<String> = listOf("Burger","Fries","Chicken",
            "Pizza","Sandwich","Onionrings",
            "Milkshake","Coke")
    var result = stringManipulation(kata, urutan)

    println(result)
}

