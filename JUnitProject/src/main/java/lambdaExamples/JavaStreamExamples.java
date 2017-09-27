package main.java.lambdaExamples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import main.java.Person;
import main.java.StatusCodeFlow;

public class JavaStreamExamples {
	
	public static void main(String args[]) {
		
		Person p1 = new Person("abc" , 10, "1");
		Person p2 = new Person("abc1" , 20, "2");
		Person p3 = new Person("abc2" , 20, "3");
		Person p4= new Person("abc3" , 40, "4");
		Person p5 = new Person("abc" , 10, "5");
		Person p6 = new Person("abc" , 10, "6");
		
		ArrayList<Person> personList = new ArrayList<Person>();
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		personList.add(p6);
		
		Map<String, List<Person>> stdByClass = personList.stream()
                .collect(Collectors.groupingBy(Person::getName));
    stdByClass.forEach((k,v)-> 
            ((List<Person>)v).stream().map(m->m.getInvoiceId()).collect(Collectors.joining(",")));
    
    //System.out.println(stdByClass);
		/*Integer totalAge = personList
			    .stream()
			    .mapToInt(Person::getAge)
			    .sum();
		
		System.out.println("Total Age Count in the List : -- " + totalAge);*/
		
/*		MerchantAdapter merchantAdapter = new MerchantAdapter();
		if (merchantAdapter.buildUserData("abc") instanceof EMSUser ) {
			System.out.println("EMSUser .....");
		} else {
			System.out.println("FDPUser .....");
		}*/
		
		List<String> words = Arrays.asList("Oracle", "Java", "Magazine");
		 List<Integer> wordLengths = 
		    words.stream()
		         .map(String::length)
		         .collect(Collectors.toList());
		//System.out.println(wordLengths);
		
	    List<String> strings = Arrays.asList(
	            "", "www", "",
	            "leveluplunch", "com", "", "", "");

	    List<String> filterStrings = strings
	            .stream()
	            .filter(p -> p.isEmpty())
	            .collect(Collectors.toList());
	    //System.out.println("Not null size " + filterStrings.size());
	    
	    StatusCodeFlow s1 = new StatusCodeFlow("ORE", 1);
	    StatusCodeFlow s2 = new StatusCodeFlow("OPI", 2);
	    StatusCodeFlow s3 = new StatusCodeFlow("RTL", 3);
	    StatusCodeFlow s4 = new StatusCodeFlow("SHP", 4);
	    StatusCodeFlow s5 = new StatusCodeFlow("AWR", 5);
	    String currentStatus = "RTL";
	    ArrayList<StatusCodeFlow> statuCodeList = new ArrayList<StatusCodeFlow>();
	    statuCodeList.add(s1);
	    statuCodeList.add(s2); 
	    statuCodeList.add(s3); 
	    statuCodeList.add(s4); 
	    statuCodeList.add(s5);
	    
	    Collection<String> listOne = new ArrayList(Arrays.asList("a","b", "c", "d", "e", "f", "g"));
	    Collection<String> listTwo = new ArrayList(Arrays.asList("a","b",  "d", "e", "f", "gg", "h"));


	    List<String> sourceList = new ArrayList<String>(listOne);
	    List<String> destinationList = new ArrayList<String>(listTwo);


	    sourceList.removeAll( listTwo );
	    destinationList.removeAll( listOne );
	    List cards = Arrays.asList("Visa", "MasterCard", "American Express", "Visa"); 
	    System.out.println("list: " + cards); 
	    Map cards2Length = (Map) cards.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1)); 
	    System.out.println("map: " + cards2Length);



	    /*	    System.out.println( sourceList );
	    System.out.println( destinationList );*/
/*	    List<String> hostingProviders = Arrays.asList("Bluehost", "GoDaddy", "Amazon AWS", "LiquidWeb", "FatCow"); 
	    System.out.println("list: " + hostingProviders); 
	    Map<String, Integer> cards2Length = hostingProviders.stream().collect(Collectors.toMap(Function.identity(), String::length, (e1, e2) -> e1)); 
	    System.out.println("map: " + cards2Length);*/

	}

}
