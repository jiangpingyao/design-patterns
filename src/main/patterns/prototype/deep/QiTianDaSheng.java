package main.patterns.prototype.deep;

import java.io.*;
import java.util.Date;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 22:21
 */
public class QiTianDaSheng extends Monkey implements Cloneable,Serializable {

    public JinGuBang jinGuBang;

    public QiTianDaSheng(){
        //初始化
        this.brithday=new Date();
        this.jinGuBang=new JinGuBang();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();
        return this.deepClone();
    }

    public Object deepClone(){

        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(this);

            ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
            ObjectInputStream ois=new ObjectInputStream(bis);

            QiTianDaSheng copy=(QiTianDaSheng)ois.readObject();
            copy.brithday=new Date();
            return copy;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
