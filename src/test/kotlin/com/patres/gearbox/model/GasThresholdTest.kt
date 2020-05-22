package com.patres.gearbox.model

import io.kotest.assertions.throwables.shouldNotThrowAny
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.FreeSpec
import io.kotest.matchers.shouldBe

internal class GasThresholdTest : FreeSpec({

    "Should create valid Gas threshold" - {
        listOf(0.0, 0.1, 1.0).map { gasThreshold ->
            "Parameter $gasThreshold" - {

                shouldNotThrowAny {
                    GasThreshold(gasThreshold)
                }

            }
        }
    }

    "Should not create invalid Gas threshold" - {
        listOf(-0.5, 1.1, 5.0).map { gasThreshold ->
            "Parameter $gasThreshold" - {

                shouldThrow<IllegalArgumentException> {
                    GasThreshold(gasThreshold)
                }

            }
        }
    }

    "Should compare Gas threshold" - {
        "Greater than" - {
            (GasThreshold(0.6) > GasThreshold(0.5)) shouldBe true
        }
        "Greater or equals than" - {
            (GasThreshold(0.5) >= GasThreshold(0.5)) shouldBe true
            (GasThreshold(0.6) >= GasThreshold(0.5)) shouldBe true
        }
        "Less than" - {
            (GasThreshold(0.4) < GasThreshold(0.5)) shouldBe true
        }

        "Less or equals than" - {
            (GasThreshold(0.4) < GasThreshold(0.5)) shouldBe true
            (GasThreshold(0.5) <= GasThreshold(0.5)) shouldBe true
        }
        "Equals" - {
            (GasThreshold(0.5) == GasThreshold(0.5)) shouldBe true
        }
    }

})