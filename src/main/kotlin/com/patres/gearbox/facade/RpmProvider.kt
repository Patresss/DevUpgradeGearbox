package com.patres.gearbox.facade

import com.patres.gearbox.external.ExternalSystems
import com.patres.gearbox.model.rpm.Rpm

class RpmProvider (private val externalSystems: ExternalSystems) {

    fun current() = Rpm.k(externalSystems.currentRpm)

}
