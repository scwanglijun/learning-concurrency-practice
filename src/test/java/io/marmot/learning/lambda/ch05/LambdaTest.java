package io.marmot.learning.lambda.ch05;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.*;

public class LambdaTest {
    @Test
    public void mockitoTest(){
        List<String> list= mock(List.class);
        List<String> otherList=new ArrayList<>(Arrays.asList("A","B","C"));
        when(list.size()).thenAnswer(inv-> otherList.size());
        Assert.assertEquals(3,list.size());
    }
}
