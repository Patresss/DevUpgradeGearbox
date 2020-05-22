package com.patres.gearbox.drivemode

import com.patres.gearbox.calculator.GearCalculator
import com.patres.gearbox.model.AggressiveMode
import com.patres.gearbox.model.GasThreshold
import com.patres.gearbox.model.Gear
import com.patres.gearbox.model.rpm.Rpm

abstract class DriveMode(val gearCalculator: GearCalculator) {

    abstract fun calculateGearWhileDriving(currentRpm: Rpm, currentGear: Gear, gasThreshold: GasThreshold, aggressiveMode: AggressiveMode): Gear

    fun calculateGearWhileBraking(rpm: Rpm, currentGear: Gear): Gear {
        return gearCalculator.calculateGearWhileBraking(rpm, currentGear)
    }

    fun increaseGear(currentGear: Gear) = gearCalculator.increaseGear(currentGear)

    fun reduceGear(currentGear: Gear) = gearCalculator.reduceGear(currentGear)

}