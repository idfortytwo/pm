package lab3

import kotlin.math.pow

fun main() {
    var hasCredit = false
    val collegeName = "PK"
    val studentName = "KEKW"
    val albumNo = "123456"

    val studentPoints = 5
    var aura = ""

    fun auraColor(studentPoints: Int = 2): Unit {
        val satisfactionLevel = (Math.random().pow((110 - studentPoints) / 100.0) * 20).toInt()

        aura = if (satisfactionLevel <= 5) {
            "red"
        } else if (satisfactionLevel <= 10) {
            "orange"
        } else if (satisfactionLevel <= 15) {
            "purple"
        } else {
            "green"
        }
    }

//    auraColor(studentPoints)
    auraColor()

    printStudentStatus(aura = aura, name = studentName)
}

fun printStudentStatus(name: String, aura: String): Unit {
    println("$name has a $aura face color")
}