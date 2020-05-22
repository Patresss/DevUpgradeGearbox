package com.patres.gearbox.drivemode

import com.patres.gearbox.model.AggressiveMode
import com.patres.gearbox.model.GasThreshold
import com.patres.gearbox.model.Gear
import com.patres.gearbox.model.GearRange
import com.patres.gearbox.model.KickDown
import com.patres.gearbox.model.rpm.Rpm
import com.patres.gearbox.model.rpm.RpmRange
import com.patres.gearbox.model.rpm.RpmVehicleSetup
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

internal class SportDriveModeTest : FreeSpec({

    val drivingRange = RpmRange(Rpm(1500L), Rpm(5000L))
    val rpmSetup = RpmVehicleSetup(drivingRange, Rpm(1500L))
    val gearRange = GearRange(Gear(1), Gear(6))

    val basicKickDown = KickDown(GasThreshold(0.5), Rpm(5000L))
    val superKickDown = KickDown(GasThreshold(0.7), Rpm(5000L))
    val driveMode = SportDriveMode(rpmSetup, gearRange, basicKickDown, superKickDown)
    val gearCalculator = driveMode.gearCalculator


    "Should calculate gear while driving without kick down" - {
        listOf(
            row(1500L, AggressiveMode.FIRST_MODE, 2, 0.0),
            row(2100L, AggressiveMode.FIRST_MODE, 1, 0.2),
            row(3500L, AggressiveMode.SECOND_MODE, 1, 0.3),
            row(6500L, AggressiveMode.FIRST_MODE, 3, 0.9)
        ).map { (rpmValue, aggressiveMode, currentGear, threshold) ->

            "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear | Threshold: $threshold" - {
                // given
                val gear = Gear(currentGear)
                val gasThreshold = GasThreshold(threshold)
                val rpm = Rpm(rpmValue)

                // when
                val calculatedGear = driveMode.calculateGearWhileDriving(rpm, gear, gasThreshold, aggressiveMode)

                // then
                calculatedGear shouldBe gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)
            }

        }
    }


    "Should reduce gear while driving because of basic kick down" - {
        listOf(
            row(4000L, AggressiveMode.FIRST_MODE, 2, 0.55),
            row(2000L, AggressiveMode.FIRST_MODE, 4, 0.60),
            row(1000L, AggressiveMode.SECOND_MODE, 4, 0.65)
        ).map { (rpmValue, aggressiveMode, currentGear, threshold) ->

            "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear | Threshold: $threshold" - {
                // given
                val gear = Gear(currentGear)
                val gasThreshold = GasThreshold(threshold)
                val rpm = Rpm(rpmValue)

                // when
                val calculatedGear = driveMode.calculateGearWhileDriving(rpm, gear, gasThreshold, aggressiveMode)

                // then
                calculatedGear shouldBe gearCalculator.reduceGear(gear)
            }

        }
    }

    "Should reduce 2 gears while driving because of super kick down" - {
        listOf(
            row(4000L, AggressiveMode.FIRST_MODE, 2, 0.75),
            row(2000L, AggressiveMode.FIRST_MODE, 4, 0.80),
            row(1000L, AggressiveMode.SECOND_MODE, 4, 0.85)
        ).map { (rpmValue, aggressiveMode, currentGear, threshold) ->

            "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear | Threshold: $threshold" - {
                // given
                val gear = Gear(currentGear)
                val gasThreshold = GasThreshold(threshold)
                val rpm = Rpm(rpmValue)

                // when
                val calculatedGear = driveMode.calculateGearWhileDriving(rpm, gear, gasThreshold, aggressiveMode)

                // then
                calculatedGear shouldBe gearCalculator.doubleReduceGear(gear)
            }

        }
    }

})