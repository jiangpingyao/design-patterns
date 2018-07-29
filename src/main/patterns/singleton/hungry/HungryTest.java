package main.patterns.singleton.hungry;

import main.patterns.singleton.lazy.LazyOne;

import java.util.concurrent.CountDownLatch;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 13:44
 */
public class HungryTest {
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

                    Object obj=Hungry.getInstance();
                    System.out.println(System.currentTimeMillis()+"："+obj);
                }
            }.start();//每循环一次，就启动一个线程,具有一定的随机性

            //没循环一次，count--
            latch.countDown();
        }

        long end=System.currentTimeMillis();

        System.out.println("总耗时："+(end-start));
    }
}
