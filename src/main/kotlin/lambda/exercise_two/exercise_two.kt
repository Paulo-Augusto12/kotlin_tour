package lambda.exercise_two

fun repeatN(n: Int, action: () -> Unit) {
    for(i in 1..n) {
        action()
    }
}