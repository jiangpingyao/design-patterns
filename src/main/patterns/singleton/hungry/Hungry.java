package main.patterns.singleton.hungry;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 13:43
 * 饿汉式単例
 */

//浪费内存
public class Hungry {
    //构造方法私有化
    private Hungry() {

    }

    //类加载的时候就初始化
    //优点：没有任何的锁，执行效率比较高
    //缺点：类加载时就初始化,占用内存空间，不用的话，浪费了内存空间
    private static  final Hungry hungry = new Hungry();

    public static Hungry getInstance(){
        return hungry;
    }

    public void print(){
        System.out.println("线程安全");
    }
}
