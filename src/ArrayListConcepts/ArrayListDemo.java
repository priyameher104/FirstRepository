package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		
		
		//default generics
		
	ArrayList <Object> ar = new ArrayList <Object>();
	ar.add(100);
	ar.add(100.00);
	ar.add("Array");
	ar.add('A');
	ar.add(true);
	
	System.out.println(ar.size());       
	System.out.println(ar);             
	System.out.println(ar.get(0));
	System.out.println(ar.get(3));
//	System.out.println(ar.get(-1));
	
	System.out.println("LI ="+ 0);
    System.out.println("HI ="+ (ar.size()-1));
	
    
    ar.add(200);
    ar.add(300);
    System.out.println(ar.size());
    
    //list with other collections i.e.creating arraylist with another arraylist
     
    ArrayList <Integer> numbers = new ArrayList <Integer> (Arrays.asList(10,20,30,40,50));
    System.out.println(numbers);
    
    ArrayList <String> langNames = new ArrayList <String> (Arrays.asList("Java","Python","JS","PHP"));
    System.out.println(langNames);
    System.out.println(langNames.size());
	}
	
}