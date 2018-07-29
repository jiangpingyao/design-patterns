package main.patterns.factory.simple;

import main.patterns.factory.Aodi;
import main.patterns.factory.Baom;
import main.patterns.factory.Benc;
import main.patterns.factory.Car;

/**
 * 简单工厂模式
 */
public class SimpleFactory {
    public Car getCar(String name){
        if("aodi".equalsIgnoreCase(name)){
            return new Aodi();
        }else if("benc".contentEquals(name)){
            return new Benc();
        }else if("baom".equalsIgnoreCase(name)){
            return new Baom();
        }else{
            System.out.println("不生产该类产品");
        }
        return null;
    }
}
