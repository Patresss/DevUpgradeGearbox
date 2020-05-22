package com.patres.gearbox.model.rpm

import com.patres.gearbox.model.AggressiveMode

data class RpmVehicleSetup(
    private val driveRangeRpm: RpmRange,
    private val brakingRpm: Rpm
) {

    fun exceededMinDriveBy(rpm: Rpm) = driveRangeRpm.minRpm > rpm

    fun exceededMaxDriveBy(rpm: Rpm, aggressiveMode: AggressiveMode) = aggressiveMode.calculateRpm(driveRangeRpm.maxRpm) < rpm

    fun exceededBrakingRmpBy(rpm: Rpm) = brakingRpm < rpm

}