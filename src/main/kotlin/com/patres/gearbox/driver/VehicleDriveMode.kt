package com.patres.gearbox.driver

import com.patres.gearbox.drivemode.ComfortDriveMode
import com.patres.gearbox.drivemode.DriveMode
import com.patres.gearbox.drivemode.EcoDriveMode
import com.patres.gearbox.drivemode.SportDriveMode

class VehicleDriveMode(
    private val ecoDriveMode: EcoDriveMode,
    private val comfortDriveMode: ComfortDriveMode,
    private val sportDriveMode: SportDriveMode
) {

    var currentMode: DriveMode = ecoDriveMode

    fun changeToEco() {
        currentMode = ecoDriveMode
    }

    fun changeToComfort() {
        currentMode = comfortDriveMode
    }

    fun changeToSport() {
        currentMode = sportDriveMode
    }

}