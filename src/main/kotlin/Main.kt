import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите длину отрезка 1: ")
    var a = reader.nextDouble()

    print("Введите длину отрезка 2: ")
    var b = reader.nextDouble()

    print("Введите длину отрезка 3: ")
    var c = reader.nextDouble()

    if (a > b) {
        val t = a
        a = b
        b = t
    }
    if (a > c) {
        val t = a
        a = c
        c = t
    }
    if (c < b) {
        val t = c
        c = b
        b = t
    }

    val result = if (a + b < c) {
        "Треугольника не существует"

    } else if ((a == b) and (a == c) and (b == c)) {
        "Треугольник равносторонний"

    } else if (c * c == a * a + b * b) {
        "Треугольник прямоугольный"

    } else if ((a != b) and (a != c) and (b != c)) {
        "Треугольник разносторонний"

    } else {
        "Треугольник равнобедренный"
    }

    print(result)

}






















