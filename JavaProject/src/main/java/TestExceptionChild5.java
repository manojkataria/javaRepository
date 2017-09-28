package main.java;

import java.util.HashSet;
import java.util.Set;

class Parent{  
  void msg()throws Exception{System.out.println("parent");}  
}  
  
public class TestExceptionChild5 
extends Parent{  
  void msg(){System.out.println("child");}  
  
  public static void main(String args[]){  
   Parent p=new TestExceptionChild5();  
   try{  
   p.msg();  
   }catch(Exception e){}  
  }  
}  

/*public static void main(String args[]) {
	Set<String> set = new HashSet<String>();
	set.add("A");
	set.add("B");
 
	for (String s : set) {
		if (s.equals("B")) {
			set.remove(s);
		}
	}
	
	System.out.println(set);
}*/
//}