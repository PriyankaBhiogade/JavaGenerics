package com.generic;

public class MaxNum<E extends Comparable<E>> {
        public E findMax(E a, E b, E c) {
            E max = a;
            if (b.compareTo(max) > 0) {
                max = b;
            }
            if (c.compareTo(max) > 0) {
                max = c;
            }
            return max;
        }
    }




