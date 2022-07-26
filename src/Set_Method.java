

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set_Method {
	
	public static void main(String[] args) {
		
		Set<Object> obj = new HashSet<>();
		
		obj.add("Java");
		obj.add("Selenium");
		obj.add("26");
		obj.add("11");
		obj.add("1993");
		obj.add("26");
		obj.add("11");
		obj.add(null);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println("The Size of Set :"   +size);
		
		boolean contains = obj.contains("26");
		
		System.out.println(contains);
		
		
		Set<Object> obj1 = new LinkedHashSet<>();
		
		obj1.add(16);
		obj1.add(05);
		obj1.add(1991);
		obj1.add("1993");
		
		System.out.println(obj1);
		
		
		//obj1.addAll(obj);
		
		//System.out.println(obj1);
		
		obj1.retainAll(obj);
		System.out.println(obj1);
		
	}

}
