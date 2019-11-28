package com.generic;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxNumTest {

    @Test
    public void givenThreeInt_whenProp_ReturnTrue() {
      MaxNum maxNum = new MaxNum();
      Integer num = maxNum.findMax();
      Assert.assertEquals((Integer)50,num);
    }
}
