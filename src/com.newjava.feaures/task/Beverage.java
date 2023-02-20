package com.newjava.feaures.task;

public sealed class Beverage implements Consume permits Coffee, Tea {

    private double temperature;

    @Override
    public void consume() {
        System.out.println("Enjoy!");
    }

    public double getTemperature() {
        return temperature;
    }

    public void heatUp() {
        temperature = 200.5;
    }


}
