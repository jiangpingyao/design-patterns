package main.patterns.prototype.deep;

import java.io.Serializable;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 22:21
 */
public class JinGuBang implements Serializable {
    public float h = 100;
    public float d = 10;

    public void big(){
        this.d *= 2;
        this.h *= 2;
    }

    public void small(){
        this.d /= 2;
        this.h /= 2;
    }

}
