/*2. O (Open-Closed)
Классы открыты для расширения, но закрыты для изменений*/
interface Report {
    fun generate(): String
}

class PdfReport : Report {
    override fun generate() = "PDF отчёт"
}

class HtmlReport : Report {
    override fun generate() = "HTML отчёт"
}

fun main() {
    val reports = listOf(PdfReport(), HtmlReport())
    reports.forEach { println(it.generate()) }
}