package main.patterns.singleton.lazy;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 14:54
 */
public class Test {
    public static void main(String[] args) {
        //测试性能
        long start = System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
            //Object obj=LazyOne.getInstance();//10

            //Object obj=LazyTwo.getInstance();//3369 性能太差

            Object obj=LazyThree.getInstance();//5
        }
        long end = System.currentTimeMillis();

        System.out.println("总耗时：" + (end - start));
    }
}
