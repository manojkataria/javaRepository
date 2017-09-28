package main.java;

/**
 * @author Manoj_Kataria
 *
 */
public class StringRecursiveReversal {
	String reverse = "";
    
    public String reverseString(String str){
         
    	if ((str.length() == 1) )
            return str;
    	System.out.println("reverseString[ " + str.substring(1) +" ]" + "+" +str.charAt(0));
        return reverseString(str.substring(1)) + str.charAt(0);
    }
     
    public static void main(String a[]){
        StringRecursiveReversal srr = new StringRecursiveReversal();
        System.out.println("Result: "+srr.reverseString("manoj"));
    }
}
