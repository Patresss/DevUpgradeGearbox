package com.patres.gearbox.drivemode

import com.patres.gearbox.calculator.GearCalculator
import com.patres.gearbox.model.*
import com.patres.gearbox.model.rpm.Rpm
import com.patres.gearbox.model.rpm.RpmVehicleSetup
import org.slf4j.LoggerFactory

class SportDriveMode(
    rpmVehicleSetup: RpmVehicleSetup,
    gearRange: GearRange,
    private val basicKickDown: KickDown,
    private val superKickDown: KickDown
) : DriveMode(GearCalculator(rpmVehicleSetup, gearRange)) {

    companion object {
        val logger = LoggerFactory.getLogger(SportDriveMode::class.java)!!
    }

    override fun calculateGearWhileDriving(currentRpm: Rpm, currentGear: Gear, gasThreshold: GasThreshold, aggressiveMode: AggressiveMode): Gear {
        return when {
            superKickDown.isTriggered(gasThreshold, currentRpm) -> triggerSuperKickDown(currentGear)
            basicKickDown.isTriggered(gasThreshold, currentRpm) -> triggerBasicKickDown(currentGear)
            else -> gearCalculator.calculateGearWhileDriving(currentRpm, currentGear, aggressiveMode)
        }
    }

    private fun triggerBasicKickDown(currentGear: Gear): Gear {
        logger.debug("Basic kick down is triggered")
        return gearCalculator.reduceGear(currentGear)
    }

    private fun triggerSuperKickDown(currentGear: Gear): Gear {
        logger.debug("Super kick down is triggered")
        sparksFromTheEngine()
        return gearCalculator.doubleReduceGear(currentGear)
    }

    private fun sparksFromTheEngine() {
    }

}