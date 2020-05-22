package com.patres.gearbox.calculator

import com.patres.gearbox.model.AggressiveMode
import com.patres.gearbox.model.Gear
import com.patres.gearbox.model.GearRange
import com.patres.gearbox.model.rpm.Rpm
import com.patres.gearbox.model.rpm.RpmVehicleSetup

class GearCalculator(
    private val rpmVehicleSetup: RpmVehicleSetup,
    private val gearRange: GearRange
) {

    fun calculateGearWhileDriving(currentRpm: Rpm, currentGear: Gear, aggressiveMode: AggressiveMode): Gear {
        return when {
            rpmVehicleSetup.exceededMaxDriveBy(currentRpm, aggressiveMode) -> gearRange.next(currentGear)
            rpmVehicleSetup.exceededMinDriveBy(currentRpm) -> gearRange.previous(currentGear)
            else -> currentGear
        }
    }

    fun calculateGearWhileBraking(currentRpm: Rpm, currentGear: Gear): Gear {
        return if (rpmVehicleSetup.exceededBrakingRmpBy(currentRpm)) gearRange.previous(currentGear) else currentGear
    }

    fun increaseGear(currentGear: Gear) = gearRange.next(currentGear)

    fun reduceGear(currentGear: Gear) = gearRange.previous(currentGear)

    fun doubleReduceGear(currentGear: Gear) = gearRange.previous(gearRange.previous(currentGear))
}