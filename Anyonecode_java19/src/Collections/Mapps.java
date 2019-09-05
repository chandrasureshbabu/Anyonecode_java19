package Collections;

import java.util.HashMap;
import java.util.Map;

public class Mapps {

	public static void main(String[] args) {
		
		
		Map<Integer, String> hmap= new HashMap<Integer,String>();
		hmap.put(1, "BMW");
		hmap.put(2, "Audi");
		hmap.put(3, "Hyundai");
		System.out.println("------------------------printing maps-----------------");
		System.out.println(hmap);
		System.out.println(hmap.get(1));
		hmap.put(4, "Honda");
		hmap.put(3, "TaTa");
		hmap.put(5, "BMW");//we can insert duplicate values , but keys are unique
		System.out.println(hmap);
		System.out.println("-----------------Oneway priniting values of maps-----------------");
		for(Map.Entry<Integer, String> entry:hmap.entrySet()) {
			
			int key=entry.getKey();
			String value=entry.getValue();
			
			System.out.println("key :"+ key + " "+"value :"+value   );
		}
		
		System.out.println("-----------------2ndway priniting values of maps-----------------");
		
		for(Integer key: hmap.keySet())
		{
			String value=hmap.get(key);
			
			System.out.println("key :"+ key + " "+"value :"+value  );
		}

	}

}
