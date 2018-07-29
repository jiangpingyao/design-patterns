package main.patterns.factory.simple;

public class SimpleFactoryTest {
    public static void main(String[] args) {

        /**
         * 过程隐藏掉了
         */
        System.out.println(new SimpleFactory().getCar("aodi").getCar());
    }
}
