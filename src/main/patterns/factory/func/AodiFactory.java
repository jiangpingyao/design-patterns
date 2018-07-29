package main.patterns.factory.func;

import main.patterns.factory.Aodi;
import main.patterns.factory.Car;

public class AodiFactory implements Factory {
    @Override
    public Car getCar() {
        return new Aodi();
    }
}
