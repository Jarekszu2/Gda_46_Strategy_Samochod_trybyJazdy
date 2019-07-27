package com.sda.dp.strategy.cars;

public class NormalMode implements IDriveMode {
    public int getHowMuchSpeedToIncrease() {
        return 5;
    }

    public double getHowMuchGasReleasedToIncrease() {
        return 0.02;
    }

    public double getHowMuchEngineWearToIncrease() {
        return 0.05;
    }

    public double getHowMuchBreaksWearToIncrease() {
        return 0.05;
    }
}
