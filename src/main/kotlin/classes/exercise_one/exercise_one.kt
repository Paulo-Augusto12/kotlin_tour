package classes.exercise_one

data class Employee(val name: String, var salary: Int)


fun giveEmployeeASalaryBoost(employee: Employee, employeeSalaryBoost: Int) {

    println("Employee: ${employee.name} | Actual Salary: ${employee.salary}R$")

    employee.salary += employeeSalaryBoost

    println("${employee.name} gained a salary boost !")

    return println("${employee.name} now receives ${employee.salary}R$")
}