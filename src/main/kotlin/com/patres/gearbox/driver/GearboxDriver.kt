package com.patres.gearbox.driver

import com.patres.gearbox.model.DriverState
import com.patres.gearbox.facade.GearboxFacade
import com.patres.gearbox.facade.RpmProvider
import com.patres.gearbox.model.AggressiveMode
import com.patres.gearbox.model.GasThreshold
import org.slf4j.LoggerFactory

class GearboxDriver(
    private val rpmProvider: RpmProvider,
    private val gearbox: GearboxFacade,
    private val vehicleDriveMode: VehicleDriveMode,
    var driverState: DriverState = DriverState.DRIVE
) {

    companion object {
        val logger = LoggerFactory.getLogger(GearboxDriver::class.java)!!
    }

    fun increaseGear() {
        val gear = driveMode().increaseGear(gearbox.currentGear())
        gearbox.changeGearTo(gear)
    }

    fun reduceGear() {
        val gear = driveMode().reduceGear(gearbox.currentGear())
        gearbox.changeGearTo(gear)
    }

    fun breaking() {
        logger.debug("Breaking")
        if (driverState == DriverState.DRIVE) {
            val gear = driveMode().calculateGearWhileBraking(rpmProvider.current(), gearbox.currentGear())
            gearbox.changeGearTo(gear)
        }
    }

    fun handleGas(gasThreshold: GasThreshold, aggressiveMode: AggressiveMode) {
        logger.debug("Handle gas - threshold: $gasThreshold | aggressiveMode: $aggressiveMode")
        if (driverState == DriverState.DRIVE) {
            val gear = driveMode().calculateGearWhileDriving(rpmProvider.current(), gearbox.currentGear(), gasThreshold, aggressiveMode)
            gearbox.changeGearTo(gear)
        }
    }
    private fun driveMode() = vehicleDriveMode.currentMode

}