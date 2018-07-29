package main.patterns.factory.abstr;

import main.patterns.factory.Aodi;
import main.patterns.factory.Baom;
import main.patterns.factory.Benc;
import main.patterns.factory.Car;

public class CarFactory extends AbstractFactory{
    @Override
    public Car getBaom() {
        return new Baom();
    }

    @Override
    public Car getBenc() {
        return new Benc();
    }

    @Override
    public Car getAodi() {
        return new Aodi();
    }
}
