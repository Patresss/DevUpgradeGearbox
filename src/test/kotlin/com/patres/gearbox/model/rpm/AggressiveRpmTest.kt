package com.patres.gearbox.model.rpm

import com.patres.gearbox.model.AggressiveMode
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

internal class AggressiveRpmTest : FreeSpec({

    "Should normalize aggressive RPM" - {
        listOf(
            row(100L, AggressiveMode.FIRST_MODE, 100L),
            row(100L, AggressiveMode.SECOND_MODE, 120L),
            row(100L, AggressiveMode.THIRD_MODE, 130L)
        ).map { (rpmValue, aggressiveMode, normalizedValue) ->

            "RPM: $rpmValue | Aggressive mode: $aggressiveMode" - {
                AggressiveRpm(Rpm(rpmValue), aggressiveMode).normalizeRpm() shouldBe Rpm(normalizedValue)
            }

        }
    }

})