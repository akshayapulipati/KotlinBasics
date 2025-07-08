package com.example.mykotlin

class Cars private constructor(
    val brand: String,
    val model: String,
    val color: String,
    val engine: String
) {

    class Builder {
        private var brand = ""
        private var model = ""
        private var color = ""
        private var engine = ""

        fun setBrand(brand: String) = apply { this.brand = brand }
        fun setModel(model: String) = apply { this.model = model }
        fun setColor(color: String) = apply { this.color = color }
        fun setEngine(engine: String) = apply { this.engine = engine }

        fun build() = Cars(brand, model, color, engine)
    }

    override fun toString(): String {
        return "Car(brand='$brand', model='$model', color='$color', engine='$engine')"
    }
}

fun main() {
    val car = Cars.Builder()
        .setBrand("BMW")
        .setModel("X5")
        .setColor("White")
        .setEngine("Diesel")
        .build()

    println(car)
}
