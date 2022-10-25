package lab4

fun main() {
    val studentStatus: (String, String) -> Unit = { name: String, aura: String ->
        println("$name has a $aura face color\n")
    }

    studentStatus("KEKW", "red")

    val student1 = StudentNoConst("lol")
    println(student1.name)
    println()

    val student2 = Student("Kekw")
    student2.showStudent()

    val student3 = StudentPerson("stu", "dent")
    student3.showStudent()
}

class StudentNoConst(name: String) {
    val name: String = name
        get() = field.capitalize()
}

class Student(private val name: String, private val university: String = "pk") {
    val showStudent: () -> Unit = {
        println("$name studies at $university\n")
    }
}

open class Person(name: String) {
    val name: String = name
        get() = field.capitalize()
}

class StudentPerson(name: String, private var university: String) : Person(name) {
    val showStudent: () -> Unit = {
        println("${this.name} studies at ${this.university}\n")
    }
}