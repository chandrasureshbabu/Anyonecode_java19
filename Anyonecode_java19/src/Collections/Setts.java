package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Setts {

	public static void main(String[] args) {
	System.out.println("hashsets-----------------------------");
	
	Set<String> set= new HashSet<String>();
	
	set.add("suresh");
	set.add("nemani");
	set.add("hyd");
	set.add("india");
	
	System.out.println(set);
	System.out.println("-----------printing hashset using iterator-----------------------------");
	for(String str:set) {
		System.out.println(str);
	}
	System.out.println("---------------printing hashset using iterator-----------------------------");
	Iterator<String> itr =  set.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
		
	Set<String> lset= new LinkedHashSet<String>();
	lset.add("suresh");
	lset.add("nemani");
	lset.add("hyd");
	lset.add("india");
	System.out.println("------------------printing linkedset  ------------------------------------");
	System.out.println(lset);
	//System.out.println("------------------printing linkedset using iterator ------------------------------------");
	Iterator<String> itr1= lset.iterator();
	while(itr1.hasNext())
	{
		System.out.println(itr1.next());
	}
	
	Set<String> Tset= new TreeSet<String>();
	Tset.add("suresh");
	Tset.add("nemani");
	Tset.add("hyd");
	Tset.add("india");
	System.out.println("------------------printing treeset  ------------------------------------");
	System.out.println(Tset);//tree set maintains alpha bitical order
	
	
	}

}
