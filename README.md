# DevUpgrade - Gearbox

DevUpgradeGearbox is Kotlin application based on [the DevUpgrade.online series](https://www.youtube.com/watch?v=Deb0GyYHoWA)

# Build
To build DevUpgradeGearbox, execute the following command:

    gradlew build

To run the simulation, execute the following command:

    gradlew run
    
To run tests, execute the following command:

    gradlew test
    
    
## Tests
Using [Kotest](https://github.com/kotest/kotest)

![](https://github.com/Patresss/DevUpgradeGearbox/blob/master/screenshoot/tests.PNG)

## Simulation

```
2020-05-22 14:22:29,113 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Increasing gears
2020-05-22 14:22:29,117 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 1
2020-05-22 14:22:29,121 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,121 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,121 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,121 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,121 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,122 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,122 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,122 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 6


2020-05-22 14:22:29,124 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Reducing gears
2020-05-22 14:22:29,124 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 6
2020-05-22 14:22:29,124 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,124 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,124 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,124 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,127 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,127 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,127 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,127 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 1


2020-05-22 14:22:29,128 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Increasing gears - Handle gas first aggression
2020-05-22 14:22:29,128 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 1
2020-05-22 14:22:29,131 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,131 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,131 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,131 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,131 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,131 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,131 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,131 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,132 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,132 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,132 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,132 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,132 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,132 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,132 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 6


2020-05-22 14:22:29,133 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Increasing gears - Handle gas second aggression
2020-05-22 14:22:29,133 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 1
2020-05-22 14:22:29,134 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: SECOND_MODE
2020-05-22 14:22:29,134 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,134 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: SECOND_MODE
2020-05-22 14:22:29,134 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,134 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: SECOND_MODE
2020-05-22 14:22:29,134 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,134 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: SECOND_MODE
2020-05-22 14:22:29,134 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,135 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: SECOND_MODE
2020-05-22 14:22:29,135 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,135 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: SECOND_MODE
2020-05-22 14:22:29,135 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,135 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: SECOND_MODE
2020-05-22 14:22:29,135 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,136 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 6


2020-05-22 14:22:29,137 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Increasing gears - Handle gas third aggression
2020-05-22 14:22:29,138 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 1
2020-05-22 14:22:29,138 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: THIRD_MODE
2020-05-22 14:22:29,138 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,138 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: THIRD_MODE
2020-05-22 14:22:29,138 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,138 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: THIRD_MODE
2020-05-22 14:22:29,139 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,139 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: THIRD_MODE
2020-05-22 14:22:29,139 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,139 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: THIRD_MODE
2020-05-22 14:22:29,139 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,139 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: THIRD_MODE
2020-05-22 14:22:29,139 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,140 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: THIRD_MODE
2020-05-22 14:22:29,140 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,140 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 6


2020-05-22 14:22:29,141 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Increasing gears - Handle gas comfort mode
2020-05-22 14:22:29,141 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 1
2020-05-22 14:22:29,141 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,142 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,143 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,143 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,143 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,143 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,143 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 6


2020-05-22 14:22:29,144 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Basic kick down - Handle gas comfort mode
2020-05-22 14:22:29,145 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 6
2020-05-22 14:22:29,145 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,145 [main] DEBUG com.patres.gearbox.drivemode.ComfortDriveMode:21 - Basic kick down is triggered
2020-05-22 14:22:29,145 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,145 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,145 [main] DEBUG com.patres.gearbox.drivemode.ComfortDriveMode:21 - Basic kick down is triggered
2020-05-22 14:22:29,146 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,146 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,146 [main] DEBUG com.patres.gearbox.drivemode.ComfortDriveMode:21 - Basic kick down is triggered
2020-05-22 14:22:29,146 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,146 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,146 [main] DEBUG com.patres.gearbox.drivemode.ComfortDriveMode:21 - Basic kick down is triggered
2020-05-22 14:22:29,146 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,146 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,147 [main] DEBUG com.patres.gearbox.drivemode.ComfortDriveMode:21 - Basic kick down is triggered
2020-05-22 14:22:29,147 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,147 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,147 [main] DEBUG com.patres.gearbox.drivemode.ComfortDriveMode:21 - Basic kick down is triggered
2020-05-22 14:22:29,147 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,147 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,147 [main] DEBUG com.patres.gearbox.drivemode.ComfortDriveMode:21 - Basic kick down is triggered
2020-05-22 14:22:29,147 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,148 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 1


2020-05-22 14:22:29,149 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Increasing gears - Handle gas sport mode
2020-05-22 14:22:29,149 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 1
2020-05-22 14:22:29,149 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,150 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,150 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,150 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,150 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,150 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,150 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,150 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,150 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,151 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,151 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,151 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,151 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.2) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,151 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 6
2020-05-22 14:22:29,151 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 6


2020-05-22 14:22:29,153 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Basic kick down - Handle gas sport mode
2020-05-22 14:22:29,153 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 6
2020-05-22 14:22:29,153 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,153 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:29 - Basic kick down is triggered
2020-05-22 14:22:29,153 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,154 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,154 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:29 - Basic kick down is triggered
2020-05-22 14:22:29,154 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,154 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,154 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:29 - Basic kick down is triggered
2020-05-22 14:22:29,154 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,154 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,154 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:29 - Basic kick down is triggered
2020-05-22 14:22:29,155 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,155 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,155 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:29 - Basic kick down is triggered
2020-05-22 14:22:29,155 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,155 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,155 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:29 - Basic kick down is triggered
2020-05-22 14:22:29,155 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,155 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.6) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,163 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:29 - Basic kick down is triggered
2020-05-22 14:22:29,164 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,164 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 1


2020-05-22 14:22:29,165 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Super kick down - Handle gas sport mode
2020-05-22 14:22:29,165 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 6
2020-05-22 14:22:29,165 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.8) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,165 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:34 - Super kick down is triggered
2020-05-22 14:22:29,165 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,165 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.8) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,165 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:34 - Super kick down is triggered
2020-05-22 14:22:29,165 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.8) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:34 - Super kick down is triggered
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.8) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:34 - Super kick down is triggered
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.8) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:34 - Super kick down is triggered
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.8) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:34 - Super kick down is triggered
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:40 - Handle gas - threshold: GasThreshold(gasThresholdValue=0.8) | aggressiveMode: FIRST_MODE
2020-05-22 14:22:29,166 [main] DEBUG com.patres.gearbox.drivemode.SportDriveMode:34 - Super kick down is triggered
2020-05-22 14:22:29,167 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,167 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 1


2020-05-22 14:22:29,168 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Braking - eco mode
2020-05-22 14:22:29,168 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 6
2020-05-22 14:22:29,168 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,169 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,170 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,170 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,170 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 1


2020-05-22 14:22:29,171 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Braking - comfort mode
2020-05-22 14:22:29,171 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 6
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,171 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,172 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,172 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,172 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,172 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,172 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,172 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 1


2020-05-22 14:22:29,174 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:202 - Simulate: Braking - sport mode
2020-05-22 14:22:29,174 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:203 - Current gear 6
2020-05-22 14:22:29,174 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,174 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 5
2020-05-22 14:22:29,174 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,174 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 4
2020-05-22 14:22:29,174 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,174 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 3
2020-05-22 14:22:29,174 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,175 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 2
2020-05-22 14:22:29,175 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,175 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,175 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,175 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,175 [main] DEBUG com.patres.gearbox.driver.GearboxDriver:32 - Breaking
2020-05-22 14:22:29,175 [main] DEBUG com.patres.gearbox.facade.GearboxFacade:14 - Change gear to 1
2020-05-22 14:22:29,175 [main] INFO  com.patres.gearbox.simulator.SimulateGearBoxDriver:205 - Current gear 1
```

