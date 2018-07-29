package main.patterns.factory.abstr;

import main.patterns.factory.Car;

/**
 * 抽象工厂模式
 */
public  abstract class AbstractFactory {
    public abstract Car getBaom();

    public abstract Car getBenc();

    public abstract Car getAodi();
}
