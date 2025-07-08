package com.example.mykotlin

class DVDPlayer {
    fun on() = println("DVD Player is ON")
    fun play() = println("DVD Player is PLAYING")
    fun off() = println("DVD Player is OFF")
}

class Projector {
    fun on() = println("Projector is ON")
    fun setInput() = println("Projector input set to DVD")
    fun off() = println("Projector is OFF")
}


class SoundSystem {
    fun on() = println("Sound System is ON")
    fun setVolume(level: Int) = println("Volume set to $level")
    fun off() = println("Sound System is OFF")
}

class HomeTheaterFacade(
    private val dvdPlayer: DVDPlayer,
    private val projector: Projector,
    private val soundSystem: SoundSystem
) {

    fun watchMovie() {
        println("🎥 Get ready to watch a movie...")

        dvdPlayer.on()
        projector.on()
        projector.setInput()
        soundSystem.on()
        soundSystem.setVolume(10)
        dvdPlayer.play()
    }


    fun endMovie() {
        println("🔌 Shutting down the theater...")
        dvdPlayer.off()
        projector.off()
        soundSystem.off()
    }
}

fun main() {
    // Create subsystem components
    val dvdPlayer = DVDPlayer()
    val projector = Projector()
    val soundSystem = SoundSystem()

    val homeTheater = HomeTheaterFacade(dvdPlayer, projector, soundSystem)
    homeTheater.watchMovie()
    println()
    homeTheater.endMovie()
}
