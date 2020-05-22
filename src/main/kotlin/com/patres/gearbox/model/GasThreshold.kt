package com.patres.gearbox.model

data class GasThreshold(private val gasThresholdValue: Double) {

    companion object {
        const val MIN_VALUE = 0.0
        const val MAX_VALUE = 1.0
    }

    init {
        require(gasThresholdValue in MIN_VALUE..MAX_VALUE) { "Threshold should be between $MIN_VALUE and $MAX_VALUE" }
    }

    operator fun compareTo(other: GasThreshold) = gasThresholdValue.compareTo(other.gasThresholdValue)

}