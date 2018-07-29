package main.patterns.prototype.simple;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 22:15
 */
public class SimpleTest {
    public static void main(String[] args) {
        Proto p=new Proto();
        p.name="jpy";

        p.proto=new Proto();
        System.out.println(p.proto);

        try {
            Proto p2=(Proto)p.clone();
            System.out.println(p2.proto);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
