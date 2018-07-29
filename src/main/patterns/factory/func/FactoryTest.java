package main.patterns.factory.func;

public class FactoryTest {
    public static void main(String[] args) {
        Factory factory=new BaomFactory();
        System.out.println(factory.getCar());
    }
}
