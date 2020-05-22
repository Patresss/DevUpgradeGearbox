package com.patres.gearbox.facade

import com.patres.gearbox.external.Gearbox
import com.patres.gearbox.model.Gear
import org.slf4j.LoggerFactory

class GearboxFacade(private val gearbox: Gearbox) {

    companion object {
        val logger = LoggerFactory.getLogger(GearboxFacade::class.java)!!
    }

    fun changeGearTo(gear: Gear) {
        logger.debug("Change gear to ${gear.toIntValue()}")
        gearbox.setCurrentGear(gear.toIntValue())
    }

    fun currentGear() = Gear((gearbox.currentGear ?: 1) as Int)

}