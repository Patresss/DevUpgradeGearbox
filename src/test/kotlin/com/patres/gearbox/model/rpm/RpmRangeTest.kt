package com.patres.gearbox.model.rpm

import com.patres.gearbox.model.AggressiveMode
import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

internal class RpmRangeTest : FreeSpec({

    "Should create valid RPM Range" - {
        listOf(
            row(1000L, 6000L),
            row(2000L, 5000L),
            row(3000L, 3000L)
        ).map { (minRpm, maxRpm) ->

            "Min RPM: $minRpm | Max RPM: $maxRpm" - {
                shouldNotThrowAny {
                    RpmRange(
                        Rpm(minRpm),
                        Rpm(maxRpm)
                    )
                }
            }

        }
    }


    "Should not create invalid RPM Range" - {
        listOf(
            row(-1000L, 1000L),
            row(5000L, 4000L),
            row(2000L, 1000L)
        ).map { (minRpm, maxRpm) ->

            "Min RPM: $minRpm | Max RPM: $maxRpm" - {
                shouldThrow<IllegalArgumentException> {
                    RpmRange(
                        Rpm(minRpm),
                        Rpm(maxRpm)
                    )
                }
            }

        }
    }


    "Should check max less than current" - {
        "Is true" - {
            listOf(
                row(1000L, 6000L, 7000L, AggressiveMode.FIRST_MODE),
                row(1000L, 6000L, 7500L, AggressiveMode.SECOND_MODE),
                row(1000L, 6000L, 8000L, AggressiveMode.THIRD_MODE)
            ).map { (minRpm, maxRpm, currentRpm, aggressiveMode) ->

                "Rpm range: [$minRpm-$maxRpm] | current: $currentRpm | AggressiveMode: $aggressiveMode" - {
                    val rpmRange = RpmRange(Rpm(minRpm), Rpm(maxRpm))
                    rpmRange.maxLessThan(Rpm(currentRpm), aggressiveMode) shouldBe true
                }

            }
        }

        "Is false" - {
            listOf(
                row(1000L, 6000L, 5000L, AggressiveMode.FIRST_MODE),
                row(1000L, 6000L, 7000L, AggressiveMode.SECOND_MODE),
                row(1000L, 6000L, 7500L, AggressiveMode.THIRD_MODE)
            ).map { (minRpm, maxRpm, currentRpm, aggressiveMode) ->

                "Rpm range: [$minRpm-$maxRpm] current: $currentRpm" - {
                    val rpmRange = RpmRange(Rpm(minRpm), Rpm(maxRpm))
                    rpmRange.maxLessThan(Rpm(currentRpm), aggressiveMode) shouldBe false
                }

            }
        }
    }
})



