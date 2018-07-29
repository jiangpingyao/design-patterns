package main.patterns.prototype.deep;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 22:32
 */
public class DeepTest {
    public static void main(String[] args) {
        QiTianDaSheng q1=new QiTianDaSheng();
        try {
            QiTianDaSheng q2=(QiTianDaSheng)q1.clone();
            System.out.println(q1.jinGuBang==q2.jinGuBang);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
