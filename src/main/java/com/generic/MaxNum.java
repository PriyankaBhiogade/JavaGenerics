package com.generic;

public class MaxNum {

    public static Integer findMax() {
        Integer a = 50;
        Integer b = 20;
        Integer c = 30;

        if(a.compareTo(b) > 0) {
            System.out.println("max"+a);
            return a;
        }
        else if( c.compareTo(b) > 0){
            System.out.println("max"+c);
            return c;
        }
        else {
            System.out.println("max"+b);
            return b;
        }
    }
}
