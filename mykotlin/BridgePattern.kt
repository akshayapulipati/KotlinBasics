package com.example.mykotlin

fun main() {
    val vectorCircle = Circled(10, 20, 5, VectorDrawingAPI())
    val rasterCircle = Circled(15, 25, 8, RasterDrawingAPI())

    vectorCircle.draw()
    rasterCircle.draw()
}


interface DrawingAPI {
    fun drawCircle(x: Int, y: Int, radius: Int)
}

class VectorDrawingAPI : DrawingAPI {
    override fun drawCircle(x: Int, y: Int, radius: Int) {
        println("Drawing circle as VECTOR at ($x, $y) with radius $radius")
    }
}

class RasterDrawingAPI : DrawingAPI {
    override fun drawCircle(x: Int, y: Int, radius: Int) {
        println("Drawing circle as RASTER at ($x, $y) with radius $radius")
    }
}

abstract class Shaped(protected val drawingAPI: DrawingAPI) {
    abstract fun draw()
}

class Circled(
    private val x: Int,
    private val y: Int,
    private val radius: Int,
    drawingAPI: DrawingAPI
) : Shaped(drawingAPI) {

    override fun draw() {
        drawingAPI.drawCircle(x, y, radius)
    }
}
