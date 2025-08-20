package com.example.livecapture

class Greeting {
    fun greeting(): String = "Hello from ${'$'}{Platform().name}"
}

expect class Platform() {
    val name: String
}
