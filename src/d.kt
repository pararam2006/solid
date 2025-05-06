/*
5. D (Dependency Inversion)
Зависимость от абстракций, а не реализаций*/
interface Database {
    fun connect()
}

class MySQL : Database {
    override fun connect() = println("Подключение к MySQL")
}

class MongoDB : Database {
    override fun connect() = println("Подключение к MongoDB")
}

class App(private val db: Database) {
    fun start() = db.connect()
}

fun main() {
    App(MySQL()).start() // Легко заменить на MongoDB
}