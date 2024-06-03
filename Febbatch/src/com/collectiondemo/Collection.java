package com.collectiondemo;

import java.util.ArrayList;
public class Collection
{
	public static void main(String[] args)
	{
		
		ArrayList List = new ArrayList<>();
		
		List.add(14);
		List.add(66.1);
		List.add("Rishi");
		List.add("1234");
		List.add(18.5f);
		List.add(true);
		
		System.out.println(List.getFirst());
		System.out.println(List.getLast());
		System.out.println(List.hashCode());
		System.out.println(List.clone());
		System.out.println(List.addAll(List));
		
		
		for (int i=0; i<List.size();i++)
		{
	    	System.out.println(List.get(i));
		}

		
	}
	

}
