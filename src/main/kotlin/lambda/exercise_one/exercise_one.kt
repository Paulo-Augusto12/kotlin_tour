package lambda.exercise_one

fun urlsList(): List<String> {
    val actions = listOf("title", "year", "author")
    val prefix = "https://example.com/book-info"
    val id = 5

    return actions.map { action -> "$prefix/$id/$action" }

}