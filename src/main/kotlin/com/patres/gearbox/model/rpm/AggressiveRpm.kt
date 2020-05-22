package com.patres.gearbox.model.rpm

import com.patres.gearbox.model.AggressiveMode


data class AggressiveRpm(val rpm: Rpm, val aggressiveMode: AggressiveMode) {

    fun normalizeRpm() = aggressiveMode.calculateRpm(rpm)

}