package com.generic;

public class MaxNum {

public static Character findMax() {

        Character a = 'a';
        Character b = 'A';
        Character c = 'b';

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
