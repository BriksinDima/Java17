package com.newjava.feaures.task;

public sealed interface Consume permits Beverage {

    void consume();
}
