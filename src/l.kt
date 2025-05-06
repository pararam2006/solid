/* 3. L (Liskov Substitution)
Подклассы должны заменять базовые классы*/
open class Bird {
    open fun move() = "Летит"
}

class Duck : Bird() {
    override fun move() = "Летит и плавает"
}

class Penguin : Bird() {
    override fun move() = "Плавает"
}

fun main() {
    val birds = listOf(Duck(), Penguin())
    birds.forEach { println(it.move()) } // Все корректно работает
}