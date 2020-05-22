package com.patres.gearbox.model

data class GearRange(
    private val minGear: Gear,
    private val maxGear: Gear
) {

    init {
        require(minGear <= maxGear) { "Min value cannot be greater than max" }
    }

    fun next(currentGear: Gear) = trim(currentGear.next())

    fun previous(currentGear: Gear) = trim(currentGear.previous())

    private fun trim(gear: Gear): Gear {
        return when {
            gear >= maxGear -> maxGear
            gear <= minGear -> minGear
            else -> gear
        }
    }
}
