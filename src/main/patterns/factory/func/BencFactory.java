package main.patterns.factory.func;

import main.patterns.factory.Benc;
import main.patterns.factory.Car;

public class BencFactory implements Factory {
    @Override
    public Car getCar() {
        return new Benc();
    }
}
