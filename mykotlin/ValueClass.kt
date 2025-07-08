package com.example.mykotlin


@JvmInline
value class Email(val value: String) {
    fun isValid(): Boolean {
        return value.contains("@") && value.contains(".")
    }

    fun domain(): String {
        return value.substringAfter("@")
    }
}

fun main() {
    val email1 = Email("user@example.com")
    val email2 = Email("invalid-email")

    println("Email 1: ${email1.value}")
    println("Is valid: ${email1.isValid()}")
    println("Domain: ${email1.domain()}")

    println("\nEmail 2: ${email2.value}")
    println("Is valid: ${email2.isValid()}")


}
