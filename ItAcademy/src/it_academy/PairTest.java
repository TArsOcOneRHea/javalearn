package it_academy;

import Homework._3_generics.ex_2.MaxMin;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by user on 11.02.2019.
 */
public class PairTest {
    @Test
    public void getMaxTest() throws Exception {
        MaxMin<Integer> integerMaxMin = new MaxMin<>(12, 25);
        Assert.assertEquals(15,(long)integerMaxMin.max());
    }
    @Test
    public void getNull() throws Exception {
        MaxMin<Integer> integerMaxMin = new MaxMin<>(null, 25);
        Assert.assertNull(integerMaxMin);
    }
    @Test
    public void formatTemp() throws Exception {
        MaxMin<Integer> integerMaxMin = new MaxMin<>(null, 25);
        Assert.fail(String.valueOf(integerMaxMin));
    }


}