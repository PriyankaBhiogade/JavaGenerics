package com.generic;

public class MaxNum {

    public static Double findMax() {
        Double a = 10.10;
        Double b = 20.20;
        Double c = 20.21;

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
