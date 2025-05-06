/*
4. I (Interface Segregation)
Узкие интерфейсы вместо одного общего*/
interface Workable {
    fun work()
}

interface Eatable {
    fun eat()
}

class Human : Workable, Eatable {
    override fun work() = println("Пишет код")
    override fun eat() = println("Ест обед")
}

class Robot : Workable {
    override fun work() = println("Собирает детали")
}

fun main() {
    val workers = listOf(Human(), Robot())
    workers.forEach { it.work() } // Нет необходимости реализовывать eat() для Robot
}