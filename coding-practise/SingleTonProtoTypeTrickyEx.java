package org.example;

import java.util.Properties;

public class SingleTonProtoTypeTrickyEx {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingleton(null);
        Prototype p = Prototype.getPrototype(null);
        Singleton s2 = Singleton.getSingleton(p);

        Prototype pp = Prototype.getPrototype(null);
        Singleton s3 = Singleton.getSingleton(pp);

        Prototype p1 = Prototype.getPrototype(s1);
        Prototype p2 = Prototype.getPrototype(s2);




        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println("===============================");
        System.out.println(p);
        System.out.println(pp);
        System.out.println(p1);
        System.out.println(p2);



    }
}

class Singleton implements Cloneable{
    private static Singleton s =null;
    private Prototype p;
    private Singleton(Prototype p){
        this.p = p;
    }
    private Singleton(){}
    public static Singleton getSingleton(Prototype p){
        if(s == null){
            synchronized(Singleton.class) {
                if(p == null){
                    s = new Singleton();
                }else{
                    s= new Singleton(p);
                }
            }
        }
        return s;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Clone not supported");
    }
}

class Prototype{
    private Singleton s;
    private Prototype(){}
    private Prototype(Singleton s){
        this.s = s;
    }
    private static Prototype p =null;
    public static Prototype getPrototype(Singleton s){
        if(s == null){
            return new Prototype();
        }
        return new Prototype(s);
    }

}

