package com.generic;

public class ArrayExample<E> {
    E[] myArray;

    public ArrayExample(E[] myArray) {
        this.myArray = myArray;
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5};
        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
//        toPrint(intArray);
//        toPrint(doubleArray);
//        toPrint(charArray);
        new ArrayExample<Integer>(intArray).toPrint();
        new ArrayExample<Double>(doubleArray).toPrint();
        new ArrayExample<Character>(charArray).toPrint();
    }

    private void toPrint() {
        toPrint(myArray);
    }

    private static <E> void toPrint(E[] intArray) {
        for (E element : intArray) {
            System.out.println(element);
        }
        System.out.println();
    }

}






