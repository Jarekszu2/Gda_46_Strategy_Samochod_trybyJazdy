package com.sda.dp.strategy.cars;

public class TurboMode implements IDriveMode {
    public int getHowMuchSpeedToIncrease() {
        return 10;
    }

    public double getHowMuchGasReleasedToIncrease() {
        return 0.05;
    }

    public double getHowMuchEngineWearToIncrease() {
        return 0.1;
    }
}
