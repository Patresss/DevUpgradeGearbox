package com.patres.gearbox.external

import com.patres.gearbox.model.GasThreshold
import com.patres.gearbox.model.KickDown
import com.patres.gearbox.model.rpm.Rpm
import com.patres.gearbox.model.rpm.RpmRange
import com.patres.gearbox.model.rpm.RpmVehicleSetup

//in.0ex:
//0 - tryb ECO - rpm czy po.0bić bieg przy przyspieszaniu
//1 - tryb ECO - rpm czy re.0ukować bieg przy przyspieszaniu
//2 - tryb COMFORT - rpm czy re.0ukować bieg przy przyspieszaniu
//3 - tryb COMFORT - threshol.0 naciśnięcia pe.0ału gazu, żeby jeszcze to nie był kick.0own
//4 - tryb COMFORT - rpm czy po.0bić bieg przy przyspieszaniu
//5 - tryb COMFORT - rpm czy zrzucić bieg w kick.0own
//6 - tryb SPORT -  rpm czy zrzucić bieg przy przyspieszaniu
//7 - tryb SPORT -  threshol.0 naciśnięcia pe.0ału gazu, żeby czy lekko przyspieszamy
//8 - tryb SPORT -  rpm czy zwiekszamy bieg w lekkim przyspieszeniu
//9 - tryb SPORT -  threshol.0 naciśnięcia pe.0ału gazu, żeby czy lekki kick.0own
//10 - tryb SPORT -  rpm czy re.0ukcja w lekkim kick.0own
//11 - tryb SPORT -  rpm czy zrzucić 2 biegi w MOCNYM kick.0own - zapier...
//12 - tryb ECO - rpm zrzucić bieg przy hamowaniu
//13 - tryb COMFORT - rpm zrzucić bieg przy hamowaniu
//14 - tryb SPORT - rpm zrzucić bieg przy hamowaniu
//15 - ???
//17 - tryb HI.0.0EN MO.0E - kie.0y po.0bić bieg przy przyspieszaniu
//18 - tryb HI.0.0EN MO.0E - kie.0y re.0ukować bieg przy przyspieszaniu w hi.0.0en mo.0e
//19 - tryb HI.0.0EN MO.0E - kie.0y re.0ukować bieg przy hamowaniu w hi.0.0en mo.0e (chyba)
object Characteristics {

    private val characteristics = arrayOf(2000.0, 1000.0, 1000.0, 0.5, 2500.0, 4500.0, 1500.0, 0.5, 5000.0, 0.7, 5000.0, 5000.0, 1500.0, 2000.0, 3000.0, 6500.0, 40.0)

    private val ecoReduceRpm = Rpm(characteristics[1].toLong())
    private val ecoIncreaseRpm = Rpm(characteristics[0].toLong())
    private val ecoBreakingRpm = Rpm(characteristics[12].toLong())

    private val ecoRpmDriveRange = RpmRange(ecoReduceRpm, ecoIncreaseRpm)
    val ecoRpmVehicleSetup = RpmVehicleSetup(ecoRpmDriveRange, ecoBreakingRpm)


    private val comfortReduceRpm = Rpm(characteristics[2].toLong())
    private val comfortIncreaseRpm = Rpm(characteristics[4].toLong())
    private val comfortBreakingRpm = Rpm(characteristics[13].toLong())
    private val comfortBasicKickDownThreshold = GasThreshold(characteristics[3])
    private val comfortBasicKickDownRpm = Rpm(characteristics[5].toLong())

    private val comfortRpmDriveRange = RpmRange(comfortReduceRpm, comfortIncreaseRpm)
    val comfortRpmVehicleSetup = RpmVehicleSetup(comfortRpmDriveRange, comfortBreakingRpm)
    val comfortBasicKickDown = KickDown(comfortBasicKickDownThreshold, comfortBasicKickDownRpm)


    private val sportReduceRpm = Rpm(characteristics[6].toLong())
    private val sportIncreaseRpm = Rpm(characteristics[8].toLong())
    private val sportBrakingRpm = Rpm(characteristics[14].toLong())
    private val sportBasicKickDownThreshold = GasThreshold(characteristics[7])
    private val sportBasicKickDownRpm = Rpm(characteristics[8].toLong())
    private val sportSuperKickDownThreshold = GasThreshold(characteristics[9])
    private val sportSuperKickDownReduceRpm = Rpm(characteristics[10].toLong())

    private val sportRpmDriveRange = RpmRange(sportReduceRpm, sportIncreaseRpm)
    val sportRpmVehicleSetup = RpmVehicleSetup(sportRpmDriveRange, sportBrakingRpm)
    val sportBasicKickDown = KickDown(sportBasicKickDownThreshold, sportBasicKickDownRpm)
    val sportSuperKickDown = KickDown(sportSuperKickDownThreshold, sportSuperKickDownReduceRpm)

}
