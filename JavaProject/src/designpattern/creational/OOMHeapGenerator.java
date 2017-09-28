package designpattern.creational;

import java.util.ArrayList;
import java.util.List;

public class OOMHeapGenerator 
{
public static void main(String[] args) 
{
        System.out.println("JVM OutOfMemoryError Simulator");
        List<String> leakingVariable = new ArrayList<String>();
        
        try 
        {
                while (1 < 2) 
                {
                leakingVariable.add("OutOfMemoryError");
                }
        } 
        catch (Throwable exp) 
        {
             if (exp instanceof java.lang.OutOfMemoryError) 
             {
             System.out.println("OutOfMemoryError triggered! " + "[" + exp + "]");
             }
             else 
             {
             System.out.println("Other Exception! " + "[" + exp + "]");
             }
        }
        System.out.println("Simulator done!");
}
}