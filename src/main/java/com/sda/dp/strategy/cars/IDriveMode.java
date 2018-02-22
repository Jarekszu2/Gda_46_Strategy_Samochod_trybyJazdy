package com.sda.dp.strategy.cars;

public interface IDriveMode {

    int getHowMuchSpeedToIncrease();

    double getHowMuchGasReleasedToIncrease();

    double getHowMuchEngineWearToIncrease();
}
