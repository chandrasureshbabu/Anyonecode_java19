package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylisst {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<String>();
		list.add("Bmw");
		list.add("audi");
		list.add("jaguar");
		list.add("tata");
		list.add("ford");
		int size=list.size();
		System.out.println("size of the list is : "+size);
		
	System.out.println("------------------------------ 1st way");
	for(int i=0;i<size;i++)
	{
		System.out.println(list.get(i));
	}
	System.out.println("------------------------------ 2nd way");
	for(Object obj:list)
	{
		System.out.println(obj);
	}
	
	//or
	System.out.println("------------------------------ 2.1 specific");
	for(String str:list)
	{	
		String s=str;
		if(s.equals("jaguar"))
		{
		System.out.println(s);
		}
	}
	System.out.println("------------------------------ 3rd way");
	Iterator<String> itr= list.iterator();
	
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("------------------------------ 3.1 specific value ");
	
	Iterator<String> itr1= list.iterator();
	while(itr1.hasNext())
	{
		String s1=itr1.next();
		if(s1.equals("Bmw"))
		{
			System.out.println(s1);
		}
	}
	System.out.println("------------------------------ Remove ");
	list.remove(size-1);
	System.out.println(list);

	}

}
