package com.patres.gearbox.model

import com.patres.gearbox.model.rpm.Rpm

enum class AggressiveMode(private val multiplier: Double) {

    FIRST_MODE(1.0),
    SECOND_MODE(1.2),
    THIRD_MODE(1.3);

    fun calculateRpm(rpm: Rpm) = rpm * multiplier

}