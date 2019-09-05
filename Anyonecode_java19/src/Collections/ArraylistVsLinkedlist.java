package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArraylistVsLinkedlist {

	public static void main(String[] args) {
		
		List<Integer> alist= new ArrayList<Integer>();
		List<Integer> llist= new LinkedList<Integer>();
		
		runduration(alist, "Arraylist");
		runduration(llist,"linkedlist");
	
	}
	
	public static void runduration(List<Integer> list, String listtype)
	{
		System.out.println("Begining-----------------------------");
		Long starttime =System.currentTimeMillis();
		System.out.println(starttime);
		for (int i=0; i<100000;i++)
		{
			list.add(i);
		}
		System.out.println("Endingofinseration------------------");
		Long Endtime=System.currentTimeMillis();
		long duration= Endtime-starttime;
		System.out.println("Duration of :"+ listtype+ "  is "+duration);
		
	}

}
