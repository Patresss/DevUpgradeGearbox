package com.patres.gearbox.model

import com.patres.gearbox.model.rpm.Rpm

data class KickDown(
    val minThreshold: GasThreshold,
    val allowedMaxRpm: Rpm
) {

    fun isTriggered(currentThreshold: GasThreshold, currentRpm: Rpm) = currentThreshold > minThreshold && currentRpm < allowedMaxRpm

}