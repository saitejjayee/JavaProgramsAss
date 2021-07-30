package com.Javaprogms;
import java.util.*;


public class SortArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();   
		   
		list.add("Kitkat");   
		list.add("five star");   
		list.add("naturo");   
		list.add("dairymilk");   
		list.add("oreo");   
		System.out.println("Before Sorting: "+ list);   
		   
		Collections.sort(list);   
	  
		System.out.println("After Sorting: "+ list);  
	}

}
