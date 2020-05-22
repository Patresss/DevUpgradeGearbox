package com.patres.gearbox.model

import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe

internal class GearTest : FreeSpec({

    "Should create valid Gear" - {
        listOf(1, 2, 5).map { gearValue ->

            "Gear : $gearValue" - {
                shouldNotThrowAny {
                    Gear(gearValue)
                }
            }

        }
    }

    "Should not create invalid Gear" - {
        listOf(0, -1, -5).map { gearValue ->

            "Gear : $gearValue" - {
                shouldThrow<IllegalArgumentException> {
                    Gear(gearValue)
                }
            }

        }
    }

    "Should find next gear" - {
        listOf(
            row(1, 2),
            row(2, 3),
            row(5, 6)
        ).map { (currentGear, nextGear) ->

            "Current gear: $currentGear" - {
                Gear(currentGear).next() shouldBe Gear(nextGear)
            }

        }
    }

    "Should find previous gear" - {
        listOf(
            row(1, 1),
            row(2, 1),
            row(5, 4)
        ).map { (currentGear, nextGear) ->

            "Current gear: $currentGear" - {
                Gear(currentGear).previous() shouldBe Gear(nextGear)
            }

        }
    }

})