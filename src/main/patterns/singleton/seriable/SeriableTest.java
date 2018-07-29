package main.patterns.singleton.seriable;

import java.io.*;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 21:37
 */
public class SeriableTest {
    public static void main(String[] args) {
        Seriable s1=null;
        Seriable s2=Seriable.INSTANCE;

        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream("Seriable.obj");
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis=new FileInputStream("Seriable.obj");
            ObjectInputStream ois=new ObjectInputStream(fis);
            s1=(Seriable)ois.readObject();
            ois.close();

            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s1==s2);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
