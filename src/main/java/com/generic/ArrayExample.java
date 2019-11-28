package com.generic;

public class ArrayExample {
    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        toPrint(intArray);
        toPrint(doubleArray);
        toPrint(charArray);
    }

    private static <E> void toPrint(E[] intArray) {
        for (E element : intArray) {
            System.out.println(element);
        }
    }
}






