package com.patres.gearbox.drivemode

import com.patres.gearbox.calculator.GearCalculator
import com.patres.gearbox.model.*
import com.patres.gearbox.model.rpm.Rpm
import com.patres.gearbox.model.rpm.RpmVehicleSetup
import org.slf4j.LoggerFactory

class ComfortDriveMode(
    rpmVehicleSetup: RpmVehicleSetup,
    gearRange: GearRange,
    private val basicKickDown: KickDown
) : DriveMode(GearCalculator(rpmVehicleSetup, gearRange)) {

    companion object {
        val logger = LoggerFactory.getLogger(ComfortDriveMode::class.java)!!
    }

    override fun calculateGearWhileDriving(currentRpm: Rpm, currentGear: Gear, gasThreshold: GasThreshold, aggressiveMode: AggressiveMode): Gear {
        if (basicKickDown.isTriggered(gasThreshold, currentRpm)) {
            logger.debug("Basic kick down is triggered")
            return gearCalculator.reduceGear(currentGear)
        }
        return gearCalculator.calculateGearWhileDriving(currentRpm, currentGear, aggressiveMode)
    }

}