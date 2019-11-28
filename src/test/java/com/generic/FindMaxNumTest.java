package com.generic;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumTest {

    @Test
    public void givenThreeDoubleNumber_ShouldReturnMaximum() {
        Double a = 1.4;
        Double b = 7.7;
        Double c = 8.7;
        MaxNum obj = new MaxNum();
        Double result = (Double) obj.findMax(a, b, c);
        Assert.assertEquals(c, result);
    }
    @Test
    public void givenThreeIntegerNumber_ShouldReturnMaximum() {
        Integer a = 1;
        Integer b = 7;
        Integer c = 8;
        MaxNum obj = new MaxNum();
        Integer result = (Integer) obj.findMax(a, b, c);
        Assert.assertEquals(c, result);
    }
    @Test
    public void givenThreeCharcater_ShouldReturnMaximum() {
        Character a = 'x';
        Character b = 'y';
        Character c = 'z';
        MaxNum obj = new MaxNum();
        Character result = (Character) obj.findMax(a, b, c);
        Assert.assertEquals(c, result);
    }
}
