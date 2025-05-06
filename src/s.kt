/*1. S (Single Responsibility)
Один класс = одна ответственность*/

// Отдельный класс для работы с данными
data class User(val name: String, val email: String)

// Отдельный класс для сохранения в БД
class UserRepository {
    fun saveToDB(user: User) = println("Сохранено: ${user.email}")
}

fun main() {
    val user = User("Иван", "ivan@mail.ru")
    UserRepository().saveToDB(user)
}