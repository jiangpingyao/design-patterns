package main.patterns.singleton.lazy;

import java.lang.reflect.Constructor;
import java.util.concurrent.CountDownLatch;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 14:39
 */
public class LazyThreeTest {
    public static void main(String[] args) {
        Class<?> clazz=LazyThree.class;

        //通过反射拿到私有的构造方法
        try {
            Constructor c=clazz.getDeclaredConstructor(null);

            //强制访问，强吻，不愿意也要吻
            c.setAccessible(true);

            //暴力初始化
            Object o1 = c.newInstance();

            //调用了两次构造方法，相当于new了两次
            //犯了原则性问题，
            Object o2 = c.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
