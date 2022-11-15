package ArrayListConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {					
	
     	public static void main(String[] args) {
     		
     		ArrayList <String> projectName = new ArrayList <String>();
     		
     		projectName.add("Project_01");
     		projectName.add("Project_02");
     		projectName.add("Project_03");
     		projectName.add("Project_04");
     		
     		//typical for loop
     		
     		for(int i=0; i<projectName.size(); i++) {
     			System.out.println(projectName.get(i));
     		} 
     		
     		System.out.println("**********");
     		
     		//for each loop
     		
     		for(String s : projectName) {
     			System.out.println(s);
     		}
     		
     		System.out.println("**********");
     		
     		//JDK-8 stream with lambda
     		
     		projectName.stream().forEach(ele -> System.out.println(ele));
     		
     		System.out.println("**********");
     		
     		//Iterator
     		
     		Iterator<String> it = projectName.iterator();
     		
     		while(it.hasNext()) {
     			System.out.println(it.next());
     		}  
     	}

}
