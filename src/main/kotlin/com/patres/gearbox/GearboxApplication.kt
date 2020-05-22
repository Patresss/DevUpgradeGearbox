package com.patres.gearbox

import com.patres.gearbox.simulator.SimulateGearBoxDriver

fun main() {
    val simulator = SimulateGearBoxDriver()
    simulateWithBlock {simulator.simulateIncreasingGears()}
    simulateWithBlock {simulator.simulateReducingGears()}

    simulateWithBlock {simulator.simulateIncreasingGearsHandleGasFirstAggression()}
    simulateWithBlock {simulator.simulateIncreasingGearsHandleGasSecondAggression()}
    simulateWithBlock {simulator.simulateIncreasingGearsHandleGasThirdAggression()}

    simulateWithBlock {simulator.simulateIncreasingGearsComfortMode()}
    simulateWithBlock {simulator.simulateBasicKickDownComfortMode()}
    simulateWithBlock {simulator.simulateIncreasingGearsSportMode()}
    simulateWithBlock {simulator.simulateBasicKickDownSportMode()}
    simulateWithBlock {simulator.simulateSuperKickDownSportMode()}

    simulateWithBlock {simulator.simulateBrakingEcoMode()}
    simulateWithBlock {simulator.simulateBrakingComfortMode()}
    simulateWithBlock {simulator.simulateBrakingSportMode()}
}

private fun simulateWithBlock(block: () -> Unit) {
    println()
    block()
    println()
}



