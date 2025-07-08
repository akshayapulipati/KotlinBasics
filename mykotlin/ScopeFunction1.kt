package com.example.mykotlin

data class User1(
    var name: String,
    var email: String,
    var isVerified: Boolean = false
)

fun main() {

    val user = User1("", "").apply {
        name = "Akshaya"
        email = "akshaya@example.com"
    }

    user.also {
        println("User registered: $it")
    }

    user.email.let {
        if (it.contains("@")) {
            println("Sending verification mail to $it")
        }
    }
    val status = user.run {
        isVerified = true
        "User $name is now verified."
    }
    println("run: $status")

    val profile = with(user) {
        println("Accessing profile...")
        "Name: $name, Email: $email, Verified: $isVerified"
    }
    println("with: $profile")
}
