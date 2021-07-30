package com.JavaProg;
import java.util.*;  

public class HighestLowest {

	public static void main(String[] args) {
		
		 TreeSet <Integer>Value = new TreeSet<Integer>();  
		Value.add(1);
		Value.add(3);
		Value.add(5);
		Value.add(15);
		Value.add(21);
		
		
		System.out.println("Lowest Value is "+Value.first());
		System.out.println("Highest Value is "+Value.last());
	}

}
