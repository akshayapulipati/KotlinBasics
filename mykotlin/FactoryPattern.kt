package com.example.mykotlin

fun main() {
    val drawable1 = ShapeFactory.createShape("circle")
    val drawable2 = ShapeFactory.createShape("square")
    val drawable3 = ShapeFactory.createShape("triangle")

    drawable1.draw()
    drawable2.draw()
    drawable3.draw()
}

//  an interface
interface DrawableShape {
    fun draw()
}


class Circles : DrawableShape {
    override fun draw() = println("Drawing Circle")
}

class Squares : DrawableShape {
    override fun draw() = println("Drawing Square")
}

class Triangles : DrawableShape {
    override fun draw() = println("Drawing Triangle")
}


object ShapeFactory {
    fun createShape(type: String): DrawableShape {
        return when (type.lowercase()) {
            "circle" -> Circles()
            "square" -> Squares()
            "triangle" -> Triangles()
            else -> throw IllegalArgumentException("Unknown shape type: $type")
        }
    }
}
