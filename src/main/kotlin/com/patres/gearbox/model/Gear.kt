package com.patres.gearbox.model

data class Gear(private val gearValue: Int) : Comparable<Gear> {

    companion object {
        const val MIN_VALUE = 1
    }

    init {
        require(gearValue >= MIN_VALUE) { "Gear should be positive number" }
    }

    override operator fun compareTo(other: Gear) = gearValue - other.gearValue

    fun next() = Gear(gearValue + 1)

    fun previous() = if (MIN_VALUE > gearValue - 1) Gear(MIN_VALUE) else Gear(gearValue - 1)

    fun toIntValue() = gearValue

}