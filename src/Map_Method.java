

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Method {
	
	public static void main(String[] args) {
		
		Map<Integer,Object> obj = new HashMap<>();
		
		obj.put(0,"Prabu");
		obj.put(1,26);
		obj.put(2,11);
		obj.put(3,1993);
		obj.put(4,26);
		obj.put(5,11);
		
		System.out.println(obj);
		
		int size = obj.size();
		System.out.println(size);
		
		Set<Integer> keySet = obj.keySet();
		System.out.println(keySet);
		
		Collection<Object> values = obj.values();
		System.out.println(values);
		
		boolean containsKey = obj.containsKey(26);
		System.out.println(containsKey);
		
		
		boolean containsValue = obj.containsValue(26);
		System.out.println(containsValue);
		
		Set<Entry<Integer, Object>> entrySet = obj.entrySet();
		
		System.out.println(entrySet);
		
		for(Entry<Integer,Object>  entry:entrySet) {
			System.out.println(entry);
		}
		
	}

}
