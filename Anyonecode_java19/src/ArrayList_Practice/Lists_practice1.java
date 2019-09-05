package ArrayList_Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lists_practice1 {
	
	public static void main(String[] args)
	{
		List<String> list=new ArrayList<String>();
		list.add("BMW");
		list.add("AUDI");
		list.add("TATA");
		list.add("Jaguar");
		list.add("Range Rover");
		list.add("land Rover");
		list.add("BMW");
		
		System.out.println(list);
		System.out.println("------------------------------------------------------1st---");
		for(int i=0; i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("------------------------------------------------------1st---");
		for(String str:list)
		{
			System.out.println(str);
			String str1=str;
			if(str1.equals("BMW"))
			{
				System.out.println("------------------------------------------------------spcific value---");
				System.out.println(str1);
			}
			
		}
		
		Iterator<String> itr= list.iterator();
		while(itr.hasNext())
		{	
			//System.out.println(itr.next());
			String s= itr.next();
			if(s.equals("AUDI"))
			
			{
				System.out.println("------------------------------------------------------spcific value---");
				System.out.println(s);
			}
		}
	}

}
