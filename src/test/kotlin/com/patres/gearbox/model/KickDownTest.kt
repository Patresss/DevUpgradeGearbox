package com.patres.gearbox.model

import com.patres.gearbox.model.rpm.Rpm
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

internal class KickDownTest : FreeSpec({

    "Should trigger kick down" - {
        listOf(
            row(0.2, 4000L, 0.5, 3000L),
            row(0.4, 2000L, 0.6, 1000L)
        ).map { (minThreshold, allowedMaxRpm, currentThreshold, currentRpm) ->

            "MinThreshold: $minThreshold | Allowed Max Rpm: $allowedMaxRpm | Current Threshold: $currentThreshold | Current Rpm: $currentRpm" - {
                val kickDown = KickDown(GasThreshold(minThreshold), Rpm(allowedMaxRpm))
                kickDown.isTriggered(GasThreshold(currentThreshold), Rpm(currentRpm)) shouldBe true
            }

        }
    }

    "Should not trigger kick down" - {
        listOf(
            row(0.6, 4000L, 0.5, 3000L),
            row(0.4, 2000L, 0.6, 3000L)
        ).map { (minThreshold, allowedMaxRpm, currentThreshold, currentRpm) ->

            "MinThreshold: $minThreshold | Allowed Max Rpm: $allowedMaxRpm | Current Threshold: $currentThreshold | Current Rpm: $currentRpm" - {
                val kickDown = KickDown(GasThreshold(minThreshold), Rpm(allowedMaxRpm))
                kickDown.isTriggered(GasThreshold(currentThreshold), Rpm(currentRpm)) shouldBe false
            }

        }
    }

})