package com.patres.gearbox.model

import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

internal class GearRangeTest : FreeSpec({

    "Should create valid Gear Range" - {
        listOf(
            row(1, 6),
            row(2, 5),
            row(3, 3)
        ).map { (gearMin, gearMax) ->

            "Gear min: $gearMin Gear max: $gearMax" - {
                shouldNotThrowAny {
                    GearRange(Gear(gearMin), Gear(gearMax))
                }
            }

        }
    }

    "Should not create invalid Gear Range" - {
        listOf(
            row(-1, 1),
            row(5, 4),
            row(2, 1)
        ).map { (gearMin, gearMax) ->

            "Gear min: $gearMin Gear max: $gearMax" - {
                shouldThrow<IllegalArgumentException> {
                    GearRange(Gear(gearMin), Gear(gearMax))
                }

            }
        }
    }

    "Should find next gear" - {
        listOf(
            row(1, 6, 4, 5),
            row(1, 4, 4, 4),
            row(1, 6, 1, 2)
        ).map { (gearMin, gearMax, currentGear, nextGear) ->

            "Gear range: [$gearMin-$gearMax] current: $currentGear" - {
                GearRange(Gear(gearMin), Gear(gearMax)).next(Gear(currentGear)) shouldBe Gear(nextGear)
            }

        }
    }

    "Should find previous gear" - {
        listOf(
            row(1, 6, 4, 3),
            row(2, 4, 2, 2),
            row(1, 6, 1, 1)
        ).map { (gearMin, gearMax, currentGear, previousGear) ->

            "Gear range: [$gearMin-$gearMax] current: $currentGear" - {
                GearRange(Gear(gearMin), Gear(gearMax)).previous(Gear(currentGear)) shouldBe Gear(previousGear)
            }

        }
    }


})