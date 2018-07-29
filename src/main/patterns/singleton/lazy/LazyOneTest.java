package main.patterns.singleton.lazy;

import java.util.concurrent.CountDownLatch;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 14:02
 */
public class LazyOneTest {
    public static void main(String[] args) {
        int count=200;
        //发号枪
        CountDownLatch latch = new CountDownLatch(count);

        long start=System.currentTimeMillis();

        for (int i=0;i<count;i++){
            new Thread(){
                @Override
                public void run() {
                    try {
                        latch.await();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    Object obj=LazyOne.getInstance();
                    System.out.println(System.currentTimeMillis()+"："+obj);
                }
            }.start();//每循环一次，就启动一个线程,具有一定的随机性

            //没循环一次，count--
            latch.countDown();
        }

        long end=System.currentTimeMillis();

        System.out.println("总耗时："+(end-start));

        //具有随机性，多测几次
        /**
         * 1532845498611：main.patterns.singleton.lazy.LazyOne@47a2a66c
         * 1532845498611：main.patterns.singleton.lazy.LazyOne@53ac2bee
         * 1532845498611：main.patterns.singleton.lazy.LazyOne@53ac2bee
         * 1532845498611：main.patterns.singleton.lazy.LazyOne@53ac2bee
         * 1532845498611：main.patterns.singleton.lazy.LazyOne@53ac2bee
         * 1532846129053：main.patterns.singleton.lazy.LazyOne@54f3b5db
         * 1532846129053：main.patterns.singleton.lazy.LazyOne@54f3b5db
         * 1532846129053：main.patterns.singleton.lazy.LazyOne@54f3b5db
         * 1532846129053：main.patterns.singleton.lazy.LazyOne@54f3b5db
         * 1532846129053：main.patterns.singleton.lazy.LazyOne@474227d3
         */
    }
}
