import functions.exercise_two.circleAreaSingleExpression

import functions.exercise_one.circleArea

import functions.exercise_three.intervalInSeconds

import lambda.exercise_one.urlsList

import lambda.exercise_two.repeatN

fun main() {

    val printDivider = " ------------------ [  ] ------------------ "

    fun divider() {
        println(printDivider)
    }

    val functionsExerciseOne = circleArea(2)

    val functionsExerciseTwo = circleAreaSingleExpression(3)

    val functionsExerciseThree = intervalInSeconds(3, 15, 25)

    val lambdaExerciseOne = urlsList()

//    val lambdaExerciseTwo = repeatN(5) { println("Hello :)") }

    divider()

    println("Functions Exercise 1  -> $functionsExerciseOne")

    divider()

    println("Functions Exercise 2 -> $functionsExerciseTwo")

    divider()

    println("Functions Exercise 3 -> $functionsExerciseThree")

    divider()

    println("Lambda exercise 1 -> $lambdaExerciseOne")

    divider()

    println("Lambda Exercise 2 -> ${repeatN(5) { println("Hello :)") } }")

    divider()
}