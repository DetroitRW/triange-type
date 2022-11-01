import java.util.*

fun main(args: Array<String>) {

    val reader = Scanner(System.`in`)

    print("Введите длину отрезка 1: ")
    val a = reader.nextDouble()

    print("Введите длину отрезка 2: ")
    val b = reader.nextDouble()

    print("Введите длину отрезка 3: ")
    val c = reader.nextDouble()

    val result = if (a + b < c || a + c < b || b + c < a)
        "Треугольника не существует"
        else  "Треугольник существует"

    print(result)

    }




