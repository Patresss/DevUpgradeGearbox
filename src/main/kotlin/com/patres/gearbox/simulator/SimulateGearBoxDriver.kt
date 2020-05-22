package com.patres.gearbox.simulator

import com.patres.gearbox.drivemode.ComfortDriveMode
import com.patres.gearbox.drivemode.EcoDriveMode
import com.patres.gearbox.drivemode.SportDriveMode
import com.patres.gearbox.driver.GearboxDriver
import com.patres.gearbox.driver.VehicleDriveMode
import com.patres.gearbox.external.Characteristics
import com.patres.gearbox.external.ExternalSystems
import com.patres.gearbox.external.Gearbox
import com.patres.gearbox.facade.GearboxFacade
import com.patres.gearbox.facade.RpmProvider
import com.patres.gearbox.model.AggressiveMode
import com.patres.gearbox.model.GasThreshold
import com.patres.gearbox.model.Gear
import com.patres.gearbox.model.GearRange
import org.slf4j.LoggerFactory

class SimulateGearBoxDriver {

    companion object {
        val logger = LoggerFactory.getLogger(SimulateGearBoxDriver::class.java)!!
    }

    private val gearbox = Gearbox()
    private val externalSystems = ExternalSystems()
    private val gearRange = GearRange(Gear(1), Gear(6))
    private val vehicleDriveMode = VehicleDriveMode(
        ecoDriveMode = EcoDriveMode(Characteristics.ecoRpmVehicleSetup, gearRange),
        comfortDriveMode = ComfortDriveMode(Characteristics.comfortRpmVehicleSetup, gearRange, Characteristics.comfortBasicKickDown),
        sportDriveMode = SportDriveMode(Characteristics.sportRpmVehicleSetup, gearRange, Characteristics.sportBasicKickDown, Characteristics.sportSuperKickDown)
    )
    private val gearboxDriver = GearboxDriver(RpmProvider(externalSystems), GearboxFacade(gearbox), vehicleDriveMode)

    fun simulateIncreasingGears() {
        gearbox.setCurrentGear(1)
        vehicleDriveMode.changeToEco()

        simulateChangingGear("Increasing gears") {
            repeat(7) {
                gearboxDriver.increaseGear()
            }
        }
    }

    fun simulateReducingGears() {
        gearbox.setCurrentGear(6)
        vehicleDriveMode.changeToEco()

        simulateChangingGear("Reducing gears") {
            repeat(7) {
                gearboxDriver.reduceGear()
            }
        }
    }

    fun simulateIncreasingGearsHandleGasFirstAggression() {
        gearbox.setCurrentGear(1)
        vehicleDriveMode.changeToEco()
        externalSystems.currentRpm = 2.1

        simulateChangingGear("Increasing gears - Handle gas first aggression") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.2), AggressiveMode.FIRST_MODE)
            }
        }
    }

    fun simulateIncreasingGearsHandleGasSecondAggression() {
        gearbox.setCurrentGear(1)
        vehicleDriveMode.changeToEco()
        externalSystems.currentRpm = 2.401

        simulateChangingGear("Increasing gears - Handle gas second aggression") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.2), AggressiveMode.SECOND_MODE)
            }
        }
    }

    fun simulateIncreasingGearsHandleGasThirdAggression() {
        gearbox.setCurrentGear(1)
        vehicleDriveMode.changeToEco()
        externalSystems.currentRpm = 2.601

        simulateChangingGear("Increasing gears - Handle gas third aggression") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.2), AggressiveMode.THIRD_MODE)
            }
        }
    }

    fun simulateReducingGearsHandleGas() {
        gearbox.setCurrentGear(6)
        vehicleDriveMode.changeToEco()
        externalSystems.currentRpm = 0.7

        simulateChangingGear("Reducing gears - Handle gas") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.2), AggressiveMode.FIRST_MODE)
            }
        }
    }

    fun simulateIncreasingGearsComfortMode() {
        gearbox.setCurrentGear(1)
        vehicleDriveMode.changeToComfort()
        externalSystems.currentRpm = 2.7

        simulateChangingGear("Increasing gears - Handle gas comfort mode") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.2), AggressiveMode.FIRST_MODE)
            }
        }
    }

    fun simulateBasicKickDownComfortMode() {
        gearbox.setCurrentGear(6)
        vehicleDriveMode.changeToComfort()
        externalSystems.currentRpm = 2.7

        simulateChangingGear("Basic kick down - Handle gas comfort mode") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.6), AggressiveMode.FIRST_MODE)
            }
        }
    }

    fun simulateIncreasingGearsSportMode() {
        gearbox.setCurrentGear(1)
        vehicleDriveMode.changeToSport()
        externalSystems.currentRpm = 6.1

        simulateChangingGear("Increasing gears - Handle gas sport mode") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.2), AggressiveMode.FIRST_MODE)
            }
        }
    }

    fun simulateBasicKickDownSportMode() {
        gearbox.setCurrentGear(6)
        vehicleDriveMode.changeToSport()
        externalSystems.currentRpm = 2.7

        simulateChangingGear("Basic kick down - Handle gas sport mode") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.6), AggressiveMode.FIRST_MODE)
            }
        }
    }

    fun simulateSuperKickDownSportMode() {
        gearbox.setCurrentGear(6)
        vehicleDriveMode.changeToSport()
        externalSystems.currentRpm = 2.7

        simulateChangingGear("Super kick down - Handle gas sport mode") {
            repeat(7) {
                gearboxDriver.handleGas(GasThreshold(0.8), AggressiveMode.FIRST_MODE)
            }
        }
    }

    fun simulateBrakingEcoMode() {
        gearbox.setCurrentGear(6)
        vehicleDriveMode.changeToEco()
        externalSystems.currentRpm = 1.6

        simulateChangingGear("Braking - eco mode") {
            repeat(7) {
                gearboxDriver.breaking()
            }
        }
    }

    fun simulateBrakingComfortMode() {
        gearbox.setCurrentGear(6)
        vehicleDriveMode.changeToComfort()
        externalSystems.currentRpm = 2.1

        simulateChangingGear("Braking - comfort mode") {
            repeat(7) {
                gearboxDriver.breaking()
            }
        }
    }

    fun simulateBrakingSportMode() {
        gearbox.setCurrentGear(6)
        vehicleDriveMode.changeToComfort()
        externalSystems.currentRpm = 3.1

        simulateChangingGear("Braking - sport mode") {
            repeat(7) {
                gearboxDriver.breaking()
            }
        }
    }

    private fun simulateChangingGear(simulateName: String, block: () -> Unit) {
        logger.info("Simulate: $simulateName")
        logger.info("Current gear ${gearbox.currentGear}")
        block()
        logger.info("Current gear ${gearbox.currentGear}")
    }


}