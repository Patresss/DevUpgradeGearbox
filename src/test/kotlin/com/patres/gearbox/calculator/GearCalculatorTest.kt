package com.patres.gearbox.calculator

import com.patres.gearbox.model.AggressiveMode
import com.patres.gearbox.model.Gear
import com.patres.gearbox.model.GearRange
import com.patres.gearbox.model.rpm.Rpm
import com.patres.gearbox.model.rpm.RpmRange
import com.patres.gearbox.model.rpm.RpmVehicleSetup
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

internal class GearCalculatorTest : FreeSpec({

    val drivingRange = RpmRange(Rpm(1000L), Rpm(2000L))
    val rpmSetup = RpmVehicleSetup(drivingRange, Rpm(1500L))
    val gearRange = GearRange(Gear(1), Gear(6))
    val gearCalculator = GearCalculator(rpmSetup, gearRange)


    "Should increase gear while driving" - {

        "Without aggressive mode" - {
            listOf(
                row(2500L, AggressiveMode.FIRST_MODE, 2),
                row(2100L, AggressiveMode.FIRST_MODE, 3),
                row(2100L, AggressiveMode.FIRST_MODE, 1)
            ).map { (rpmValue, aggressiveMode, currentGear) ->

                "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear" - {
                    // given
                    val gear = Gear(currentGear)
                    val rpm = Rpm(rpmValue)

                    // when
                    val calculatedGear = gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)

                    // then
                    calculatedGear shouldBe gear.next()
                }

            }
        }

        "With aggressive mode" - {
            listOf(
                row(2500L, AggressiveMode.SECOND_MODE, 2),
                row(2500L, AggressiveMode.SECOND_MODE, 3),
                row(2800L, AggressiveMode.THIRD_MODE, 1)
            ).map { (rpmValue, aggressiveMode, currentGear) ->

                "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear" - {
                    // given
                    val gear = Gear(currentGear)
                    val rpm = Rpm(rpmValue)

                    // when
                    val calculatedGear = gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)

                    // then
                    calculatedGear shouldBe gear.next()
                }

            }
        }
    }


    "Should not increase gear while driving" - {

        "Without aggressive mode" - {
            listOf(
                row(1900L, AggressiveMode.FIRST_MODE, 2),
                row(1900L, AggressiveMode.FIRST_MODE, 3),
                row(2500L, AggressiveMode.FIRST_MODE, 6)
            ).map { (rpmValue, aggressiveMode, currentGear) ->

                "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear" - {
                    // given
                    val gear = Gear(currentGear)
                    val rpm = Rpm(rpmValue)

                    // when
                    val calculatedGear = gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)

                    // then
                    calculatedGear shouldBe gear
                }
            }
        }

        "With aggressive mode" - {
            listOf(
                row(2200L, AggressiveMode.SECOND_MODE, 2),
                row(2500L, AggressiveMode.THIRD_MODE, 3),
                row(1500L, AggressiveMode.THIRD_MODE, 6)
            ).map { (rpmValue, aggressiveMode, currentGear) ->

                "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear" - {
                    // given
                    val gear = Gear(currentGear)
                    val rpm = Rpm(rpmValue)

                    // when
                    val calculatedGear = gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)

                    // then
                    calculatedGear shouldBe gear
                }

            }
        }
    }


    "Should reduce gear while driving" - {

        "Without aggressive mode" - {
            listOf(
                row(800L, AggressiveMode.FIRST_MODE, 2),
                row(900L, AggressiveMode.FIRST_MODE, 3),
                row(500L, AggressiveMode.FIRST_MODE, 6)
            ).map { (rpmValue, aggressiveMode, currentGear) ->

                "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear" - {
                    // given
                    val gear = Gear(currentGear)
                    val rpm = Rpm(rpmValue)

                    // when
                    val calculatedGear = gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)

                    // then
                    calculatedGear shouldBe gear.previous()
                }

            }
        }

        "With aggressive mode - that should be ignored for reduction" - {
            listOf(
                row(800L, AggressiveMode.SECOND_MODE, 2),
                row(900L, AggressiveMode.THIRD_MODE, 3),
                row(500L, AggressiveMode.THIRD_MODE, 6)
            ).map { (rpmValue, aggressiveMode, currentGear) ->

                "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear" - {
                    // given
                    val gear = Gear(currentGear)
                    val rpm = Rpm(rpmValue)

                    // when
                    val calculatedGear = gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)

                    // then
                    calculatedGear shouldBe gear.previous()
                }

            }
        }
    }


    "Should not reduce gear while driving" - {

        "Without aggressive mode" - {
            listOf(
                row(1100L, AggressiveMode.FIRST_MODE, 2),
                row(1500L, AggressiveMode.FIRST_MODE, 3),
                row(500L, AggressiveMode.FIRST_MODE, 1)
            ).map { (rpmValue, aggressiveMode, currentGear) ->

                "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear" - {
                    // given
                    val gear = Gear(currentGear)
                    val rpm = Rpm(rpmValue)

                    // when
                    val calculatedGear = gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)

                    // then
                    calculatedGear shouldBe gear
                }

            }
        }

        "With aggressive mode - that should be ignored for reduction" - {
            listOf(
                row(800L, AggressiveMode.SECOND_MODE, 2),
                row(900L, AggressiveMode.THIRD_MODE, 3),
                row(500L, AggressiveMode.THIRD_MODE, 1)
            ).map { (rpmValue, aggressiveMode, currentGear) ->

                "RPM: $rpmValue | Aggressive mode: $aggressiveMode | Current Gear: $currentGear" - {
                    // given
                    val gear = Gear(currentGear)
                    val rpm = Rpm(rpmValue)

                    // when
                    val calculatedGear = gearCalculator.calculateGearWhileDriving(rpm, gear, aggressiveMode)

                    // then
                    calculatedGear shouldBe gear.previous()
                }

            }
        }
    }


    "Should reduce gear while braking" - {
        listOf(
            row(1800L, 2),
            row(1600L, 3)
        ).map { (rpmValue, currentGear) ->

            "RPM: $rpmValue | Current Gear: $currentGear" - {
                // given
                val gear = Gear(currentGear)
                val rpm = Rpm(rpmValue)

                // when
                val calculatedGear = gearCalculator.calculateGearWhileBraking(rpm, gear)

                // then
                calculatedGear shouldBe gear.previous()
            }

        }
    }


    "Should not reduce gear while braking" - {
        listOf(
            row(1400L, 2),
            row(1600L, 1)
        ).map { (rpmValue, currentGear) ->

            "RPM: $rpmValue | Current Gear: $currentGear" - {
                // given
                val gear = Gear(currentGear)
                val rpm = Rpm(rpmValue)

                // when
                val calculatedGear = gearCalculator.calculateGearWhileBraking(rpm, gear)

                // then
                calculatedGear shouldBe gear
            }

        }
    }

})