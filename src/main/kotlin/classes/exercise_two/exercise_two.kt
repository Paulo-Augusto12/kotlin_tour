package classes.exercise_two

import kotlin.random.Random

import classes.Employee


class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {
    private val names: List<String> = listOf<String>("Alex", "Paulo", "Thiago", "Fernando", "Matheus")

    fun generateEmployee() {
        Employee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))
    }
}

fun employeeGenerator() {
    val empGen = RandomEmployeeGenerator(10, 30)
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    println(empGen.generateEmployee())
    empGen.minSalary = 50
    empGen.maxSalary = 100
    println(empGen.generateEmployee())
}