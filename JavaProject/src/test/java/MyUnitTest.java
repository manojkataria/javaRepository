package test.java;

import java.util.Arrays;

import main.java.MyUnit;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyUnitTest {

    @Test
    public void testConcatenate() {
        MyUnit myUnit = new MyUnit();
        String result = myUnit.concatenate("one", "two");
        assertEquals("onetwo", result);
    }
    
     
    @Test
    public void evenNumberTest(){
        MyUnitTest asft = new MyUnitTest();
        assertTrue(asft.isEvenNumber(4));
    }

    @Test
    public void testArraysSort(){
    	int[] numbers = {5,6,4,2,3,1};
    	Arrays.sort(numbers);
    	int[] expectedOutput = {1,2,3,4,5,6};
    	assertArrayEquals(expectedOutput, numbers);
    }

    @Test(expected = NullPointerException.class)
    public void testArraysSortWithNullCondition(){
    	int[] numbers = null;
    	Arrays.sort(numbers);
    }
    
   private boolean isEvenNumber(int number){
        
        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}