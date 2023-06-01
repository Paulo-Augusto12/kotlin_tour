package classes.exercise_two

import kotlin.random.Random

import classes.Employee


class RandomEmployeeGenerator(var minSalary: Int, var maxSalary: Int) {

    val names = listOf("John", "Mary", "Ann", "Paul", "Jack", "Elizabeth")
    fun generateEmployee(): Employee {
        return Employee(names.random(), Random.nextInt(from = minSalary, until = maxSalary))

    }
}

fun employeeGenerator(): Employee {
    val empGen = RandomEmployeeGenerator(10, 30)

    val x = empGen.generateEmployee()
    empGen.minSalary = 50
    empGen.maxSalary = 100

    return x
}