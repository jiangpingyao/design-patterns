package main.patterns.singleton.lazy;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 13:55
 * 赖汉式単例
 */

//在外部需要使用的时候才实例化，不占用内存空间
public class LazyOne {
    private LazyOne(){

    }

    private static LazyOne lazyOne=null;

    public static  LazyOne getInstance(){
        if(lazyOne==null){
            lazyOne = new LazyOne();
        }
        return lazyOne;
    }

    public void print(){
        System.out.println("线程不安全，多个线程同时调用这个方法，同时判断为null，同时new出了多个对象，可能不一样");
    }
}
