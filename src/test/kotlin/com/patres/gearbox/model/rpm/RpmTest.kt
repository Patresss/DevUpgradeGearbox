package com.patres.gearbox.model.rpm

import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.data.row
import io.kotest.matchers.shouldBe


class RpmTest : FreeSpec({

    "Should create valid RPM" - {
        listOf(0L, 2L, 33L).map { rpmValue ->
            "Parameter $rpmValue" - {

                shouldNotThrowAny {
                    Rpm(rpmValue)
                }

            }
        }
    }

    "Should not create invalid RPM" - {
        listOf(-1L, -2L, -33L).map { rpmValue ->
            "Parameter $rpmValue" - {

                shouldThrow<IllegalArgumentException> {
                    Rpm(rpmValue)
                }

            }
        }
    }

    "Should create RPM k" - {
        listOf(
            row(0.0, Rpm(0)),
            row(2.0, Rpm(2000)),
            row(12.3, Rpm(12300))
        ).map { (rpmValue, expectedValue) ->
            "Parameter $rpmValue" - {

                Rpm.k(rpmValue) shouldBe expectedValue

            }
        }
    }

    "Should compare RPM" - {
        "Greater than" - {
            (Rpm(2) > Rpm(
                1
            )) shouldBe true
        }
        "Greater or equals than" - {
            (Rpm(2) >= Rpm(
                1
            )) shouldBe true
            (Rpm(2) >= Rpm(
                2
            )) shouldBe true
        }
        "Less than" - {
            (Rpm(3) < Rpm(
                4
            )) shouldBe true
        }

        "Less or equals than" - {
            (Rpm(3) < Rpm(
                4
            )) shouldBe true
            (Rpm(4) <= Rpm(
                4
            )) shouldBe true
        }
        "Equals" - {
            (Rpm(3) == Rpm(
                3
            )) shouldBe true
            (Rpm.k(3.0) == Rpm(
                3000
            )) shouldBe true
        }
    }

})