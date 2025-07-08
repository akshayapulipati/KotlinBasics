package com.example.mykotlin


fun main() {
    val celsiusThermometer = CelsiusThermometer()
    val fahrenheitSensor: Temperature = CelsiusToFahrenheitAdapter(celsiusThermometer)
    println("Temperature in Fahrenheit: ${fahrenheitSensor.getTemperature()}")
}

interface Temperature {
    fun getTemperature(): Double  // Returns temperature in Fahrenheit
}

//  Adaptee class: Already exists, but returns temperature in Celsius
class CelsiusThermometer {
    fun getTempInCelsius(): Double {
        return 25.0  // Let's assume this is the sensor reading
    }
}
class CelsiusToFahrenheitAdapter(private val celsiusThermometer: CelsiusThermometer) : Temperature {

    // Convert Celsius to Fahrenheit
    override fun getTemperature(): Double {
        val celsius = celsiusThermometer.getTempInCelsius()
        return celsius * 9 / 5 + 32  // Formula: F = C × 9/5 + 32
    }
}
