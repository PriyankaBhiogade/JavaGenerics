package com.generic;

public class ArrayExample {
    public static void main(String[] args) {
        int num[]={1,2,3,4,5};
        double  doubleArray[]={1.5,2.5,3.5,4.5,5.5};
        char name[]={'a','b','c','d','e'};
        toPrint(num);
        toPrint(doubleArray);
        toPrint(name);
    }

    private static void toPrint(char[] name) {
        for (int i=0;i<name.length;i++){
            System.out.println(name[i]);
        }
    }

    private static void toPrint(double[] doubleArray) {
        for(int i=0;i<doubleArray.length;i++){
            System.out.println("DoubleArray::"+i);
        }
    }

    private static void toPrint(int[] num) {
        for(int i=0;i<num.length;i++){
            System.out.println("IntArray::"+i);
        }
    }

}
