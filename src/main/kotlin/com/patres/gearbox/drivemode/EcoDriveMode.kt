package com.patres.gearbox.drivemode

import com.patres.gearbox.calculator.GearCalculator
import com.patres.gearbox.model.AggressiveMode
import com.patres.gearbox.model.GasThreshold
import com.patres.gearbox.model.Gear
import com.patres.gearbox.model.GearRange
import com.patres.gearbox.model.rpm.Rpm
import com.patres.gearbox.model.rpm.RpmVehicleSetup

class EcoDriveMode(rpmVehicleSetup: RpmVehicleSetup, gearRange: GearRange) : DriveMode(GearCalculator(rpmVehicleSetup, gearRange)) {

    override fun calculateGearWhileDriving(currentRpm: Rpm, currentGear: Gear, gasThreshold: GasThreshold, aggressiveMode: AggressiveMode): Gear {
        return gearCalculator.calculateGearWhileDriving(currentRpm, currentGear, aggressiveMode)
    }

}