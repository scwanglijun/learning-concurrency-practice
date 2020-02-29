package io.marmot.learning.lambda.ch05;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.hasItem;

public class SetTest {




    @Test
    public void testSameOrder(){
        Set<Integer>  numbers=new HashSet<>(asList(4,3,2,1));

        List<Integer> sameOrders=numbers.stream().collect(Collectors.toList());

        Assert.assertEquals(asList(4,3,2,1),sameOrders);
    }


    @Test
    public void hasItemTest(){
        List<Integer> numbers= Arrays.asList(1,2,3,4);
        List<Integer> stillOrdered=numbers.stream().map(x->x+1).collect(Collectors.toList());

        Assert.assertEquals(asList(2,3,4,5),stillOrdered);


        Set<Integer> unordered=new HashSet<>(numbers);

        List<Integer> stillUnordered=unordered.stream().map(x->x+1).collect(Collectors.toList());

        Assert.assertThat(stillUnordered,hasItem(2));
        Assert.assertThat(stillUnordered,hasItem(3));
        Assert.assertThat(stillUnordered,hasItem(4));
        Assert.assertThat(stillUnordered,hasItem(5));

    }
}
