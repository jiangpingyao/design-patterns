package main.patterns.singleton.lazy;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 14:39
 */
//兼顾了饿汉式的内存浪费也兼顾了synchronized的性能问题
    //完美的屏蔽了这两个缺点
public class LazyThree {

    private boolean initialized = false;

    //默认使用LazyThree的时候，会先初始化内部类
    //如果没使用的话，内部类是不加载的

    private LazyThree(){
        synchronized (LazyThree.class){
            if(initialized==false){
                initialized=!initialized;
                //System.out.println(initialized);
            }else{
                throw new RuntimeException("単例已被侵犯");
            }
        }
    }

    //static 是为了使单例的空间共享
    //final 保证这个方法不会被重写，重载

    public static final LazyThree getInstance(){
        //在返回结果以前，一定会先加载内部类
        return LazyHolder.LAZY_THREE;
    }

    //内部类
    private static class LazyHolder{
        private static final LazyThree LAZY_THREE=new LazyThree();
    }
}
