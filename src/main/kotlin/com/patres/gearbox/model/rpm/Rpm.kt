package com.patres.gearbox.model.rpm


data class Rpm(val rpmValue: Long) {

    companion object {
        fun k(kRpmValue: Double) = Rpm((kRpmValue * 1000).toLong())
    }

    init {
        require(rpmValue >= 0) { "RPM should not be negative number" }
    }

    operator fun compareTo(other: Rpm) = (rpmValue - other.rpmValue).toInt()

    operator fun times(multiplier: Double) = Rpm((rpmValue * multiplier).toLong())

}