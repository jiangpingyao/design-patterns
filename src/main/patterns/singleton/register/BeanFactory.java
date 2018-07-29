package main.patterns.singleton.register;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 21:06
 */
//注册时単例,spring ioc用的这种
public class BeanFactory {

    private BeanFactory(){};

    //private static Map<String,Object> ioc=new HashMap<String,Object>();

    private static Map<String,Object> ioc=new ConcurrentHashMap<>();

    public static Object getBean(String name){
        if(!ioc.containsKey(name)){
            Object obj=null;
            try {
                obj=Class.forName(name).newInstance();
                ioc.put(name,obj);
            }  catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }else{
            return ioc.get(name);
        }
    }
}
