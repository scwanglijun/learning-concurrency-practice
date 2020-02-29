package io.marmot.learning.lambda.ch05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListTest {

    @Test
    public void sameOrder(){
        //元素的顺序的问题
        List<Integer>  numbers= Arrays.asList(1,2,3,4);
        List<Integer> sameOrders=numbers.stream().collect(Collectors.toList());

        Assert.assertEquals(numbers,sameOrders);
    }
}
