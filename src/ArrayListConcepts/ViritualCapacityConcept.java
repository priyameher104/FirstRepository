package ArrayListConcepts;

import java.util.ArrayList;

public class ViritualCapacityConcept {
	public static void main(String[] args) {
		
		ArrayList <Object> ar = new ArrayList <Object>();           //VC=10 byDefault
		System.out.println(ar.size());//PC=0                          
		
		ar.add(100);
		System.out.println(ar.size());//PC=1
		
		ar.add(200);
		ar.add(300);
		ar.add(400);
		System.out.println(ar.size());//PC=4
		System.out.println(ar.get(0));//100
		System.out.println(ar.get(3));//400
		
		
	}

}
