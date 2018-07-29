package main.patterns.singleton.register;

/**
 * @Author:jpy
 * @Date:2018\7\29 0029 21:23
 */
//枚举式単例
public enum RegisterEnum {
    RED(){
        private int r=255;
        private int g=0;
        private int b=0;
    },BlACK,WHITR;
}
