package com.example.kotlinbasics1

fun main() {

    val studentName: String = "Akshaya"
    val grade: Char = 'B'


    val rollNumber: Int = 101
    val percentage: Double = 87.6


    val isScholarshipEligible: Boolean = percentage > 85.0

    // Nullable type
    var phoneNumber: String? = null


    val subjects = arrayOf("Math", "Science", "English", "Computer")

    // Print student info
    println("Student Details")
    println("---------------------------")
    println("Name: $studentName")
    println("Roll No: $rollNumber")
    println("Grade: $grade")
    println("Subjects enrolled:")
    //A for-loop to iterate over the subjects array and print each subject.
    for (subject in subjects) {
        println(" - $subject")
    }
    println("Percentage: $percentage%")
    //inline if-expression to print yes if eligible otherwise no.
    println("Scholarship Eligible: ${if (isScholarshipEligible) "Yes" else "No"}")
    //Elvis operator ,if phone num is null prints not provided
    println("Phone Number: ${phoneNumber ?: "Not Provided"}")

    //function to show result
    printFinalResult(percentage)
}

// function using when expression
fun printFinalResult(percentage: Double) {
    val result = when {
        percentage >= 90 -> "Outstanding"
        percentage >= 75 -> "Very Good"
        percentage >= 60 -> "Good"
        else -> "Need improvement "
    }
    println("Final Result: $result")
}

