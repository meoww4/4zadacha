fun main() {
    println("Введите два числа и символ операции (например, 3.5 4.2 +):")
    val input = readLine() ?: ""

    val parts = input.split(" ")
    if (parts.size != 3) {
        println("Ошибка: Введите два числа и один символ операции, разделенные пробелами.")
        return
    }

    val num1 = parts[0].toDoubleOrNull()
    val num2 = parts[1].toDoubleOrNull()
    val operation = parts[2]

    if (num1 == null || num2 == null) {
        println("Ошибка: Введены некорректные числа.")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0.0) num1 / num2 else {
            println("Ошибка: Деление на ноль.")
            return
        }
        else -> {
            println("Ошибка: Некорректный символ операции.")
            return
        }
    }

    println("Результат: $result")
}
