fun main() {
    val  makanan = setOf(" milkshake", " pizza", " chicken", " fries", " coke", " burger", " pizza", " sandwich", " milkshake", " pizza")
    print(makanan.elementAt(5))
    print(makanan.elementAt(3))
    print(makanan.elementAt(2))
    print(makanan.elementAt(1))
    print(makanan.elementAt(1))
    print(makanan.elementAt(1))
    print(makanan.elementAt(6))
    print(makanan.elementAt(0))
    print(makanan.elementAt(0))
    println(makanan.elementAt(4))


    val makanan2 = setOf(" pizza"," chicken"," fries"," burger"," coke"," milkshake"," fries"," sandwich")
    print(makanan2.elementAt(3))
    print(makanan2.elementAt(2))
    print(makanan2.elementAt(2))
    print(makanan2.elementAt(1))
    print(makanan2.elementAt(0))
    print(makanan2.elementAtOrNull(7))
    print(makanan2.elementAt(6))
    print(makanan2.elementAt(5))
}
