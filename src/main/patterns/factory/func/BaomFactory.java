package main.patterns.factory.func;

import main.patterns.factory.Baom;
import main.patterns.factory.Car;

public class BaomFactory implements Factory {
    @Override
    public Car getCar() {
        return new Baom();
    }
}
