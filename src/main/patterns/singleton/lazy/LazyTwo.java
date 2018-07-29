package main.patterns.singleton.lazy;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 14:28
 */
//性能差
public class LazyTwo {
    private LazyTwo(){

    }

    private static  LazyTwo lazyTwo=null;

    //加同步锁，性能差
    public static synchronized LazyTwo getInstance(){
        if(lazyTwo==null){
            lazyTwo=new LazyTwo();
        }
        return lazyTwo;
    }
}
