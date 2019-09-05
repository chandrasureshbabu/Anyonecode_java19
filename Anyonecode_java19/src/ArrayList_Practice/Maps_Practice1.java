package ArrayList_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps_Practice1 {

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
		System.out.println("---------------------printing 1st way of maps------------------------------");
		Set<Integer> keys=hmap.keySet();
		System.out.println("size of keys -----"+keys.size());
		for(Integer key:keys) {
			System.out.println(hmap.get(key));
		}
		
		System.out.println("---------------------printing 2nd way of maps------------------------------");
		
		for(Integer key:hmap.keySet())
		{
			System.out.println(hmap.get(key));
		}
		System.out.println("---------------------printing 3rd way of maps------------------------------");
		for(Map.Entry<Integer, String> entry:hmap.entrySet())
		{
			int i=entry.getKey();
			String value=entry.getValue();
			
			System.out.println("Key is : "+i+" ,value is : "+value );
		}
		
		
	}

}
