package com.example.mykotlin

interface Draggable {
    fun drag()
}
interface Clickable {
    fun click() {
        println("Object clicked")
    }
}
class Button : Draggable, Clickable {
    override fun drag() {
        println("Button is being dragged")
    }
}
fun main() {
    val button = Button()
    button.click()
    button.drag()

    val draggable: Draggable = button
    draggable.drag()
    val clickable: Clickable = button
    clickable.click()
}
