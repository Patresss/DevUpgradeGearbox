package com.patres.gearbox.model.rpm

import com.patres.gearbox.model.AggressiveMode
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

internal class RpmVehicleSetupTest : FreeSpec({

    "Should exceeded min drive" - {
        "Is true" - {
            listOf(
                row(1000L, 6000L, 700L),
                row(2000L, 5000L, 800L)
            ).map { (minRpm, maxRpm, currentRpm) ->

                "Rpm drive range: [$minRpm-$maxRpm] | current: $currentRpm" - {
                    val drivingRange = RpmRange(Rpm(minRpm),Rpm(maxRpm))
                    val rpmSetup = RpmVehicleSetup(drivingRange, Rpm(1L))

                    rpmSetup.exceededMinDriveBy(Rpm(currentRpm)) shouldBe true
                }

            }
        }

        "Is false" - {
            listOf(
                row(1000L, 6000L, 7000L),
                row(2000L, 5000L, 3000L)
            ).map { (minRpm, maxRpm, currentRpm) ->

                "Rpm drive range: [$minRpm-$maxRpm] | current: $currentRpm" - {
                    val drivingRange = RpmRange(Rpm(minRpm),Rpm(maxRpm))
                    val rpmSetup = RpmVehicleSetup(drivingRange, Rpm(1L))

                    rpmSetup.exceededMinDriveBy(Rpm(currentRpm)) shouldBe false
                }

            }
        }
    }

    "Should exceeded max drive" - {
        "Is true" - {
            listOf(
                row(1000L, 6000L, 7000L, AggressiveMode.FIRST_MODE),
                row(1000L, 6000L, 7500L, AggressiveMode.SECOND_MODE),
                row(1000L, 6000L, 8000L, AggressiveMode.THIRD_MODE)
            ).map { (minRpm, maxRpm, currentRpm, aggressiveMode) ->

                "Rpm drive range: [$minRpm-$maxRpm] | current: $currentRpm | AggressiveMode: $aggressiveMode" - {
                    // given
                    val drivingRange = RpmRange(Rpm(minRpm),Rpm(maxRpm))
                    val rpmSetup = RpmVehicleSetup(drivingRange, Rpm(1L))

                    // when
                    val exceededMaxValue = rpmSetup.exceededMaxDriveBy(Rpm(currentRpm), aggressiveMode)

                    // then
                    exceededMaxValue shouldBe true
                }

            }
        }

        "Is false" - {
            listOf(
                row(1000L, 6000L, 5000L, AggressiveMode.FIRST_MODE),
                row(1000L, 6000L, 7000L, AggressiveMode.SECOND_MODE),
                row(1000L, 6000L, 7500L, AggressiveMode.THIRD_MODE)
            ).map { (minRpm, maxRpm, currentRpm, aggressiveMode) ->

                "Rpm drive range: [$minRpm-$maxRpm] | current: $currentRpm | AggressiveMode: $aggressiveMode" - {
                    // given
                    val drivingRange = RpmRange(Rpm(minRpm),Rpm(maxRpm))
                    val rpmSetup = RpmVehicleSetup(drivingRange, Rpm(1L))

                    // when
                    val exceededMaxValue = rpmSetup.exceededMaxDriveBy(Rpm(currentRpm), aggressiveMode)

                    // then
                    exceededMaxValue shouldBe false
                }

            }
        }
    }

    "Should exceeded breaking rpm" - {
        "Is true" - {
            listOf(
                row(1000L,  4000L),
                row(2000L,  3000L)
            ).map { (brakingRpm,  currentRpm) ->

                "Rpm braking: $brakingRpm | current: $currentRpm" - {
                    val drivingRange = RpmRange(Rpm(1),Rpm(2))
                    val rpmSetup = RpmVehicleSetup(drivingRange, Rpm(brakingRpm))

                    rpmSetup.exceededBrakingRmpBy(Rpm(currentRpm)) shouldBe true
                }

            }
        }

        "Is false" - {
            listOf(
                row(1000L,  500L),
                row(2000L,  1000L)
            ).map { (brakingRpm,  currentRpm) ->

                "Rpm braking: $brakingRpm | current: $currentRpm" - {
                    val drivingRange = RpmRange(Rpm(1),Rpm(2))
                    val rpmSetup = RpmVehicleSetup(drivingRange, Rpm(brakingRpm))

                    rpmSetup.exceededBrakingRmpBy(Rpm(currentRpm)) shouldBe false
                }

            }
        }
    }

})