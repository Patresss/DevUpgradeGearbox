package com.patres.gearbox.model.rpm

import com.patres.gearbox.model.AggressiveMode

data class RpmRange(
    val minRpm: Rpm,
    val maxRpm: Rpm
) {

    init {
        require(minRpm <= maxRpm) { "Min value cannot be greater than max" }
    }

    fun maxLessThan(rpm: Rpm, aggressiveMode: AggressiveMode) = aggressiveMode.calculateRpm(maxRpm) < rpm
}