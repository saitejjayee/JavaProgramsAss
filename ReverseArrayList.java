package com.JavaProg;
import java.util.*;
public class ReverseArrayList {

	public static void main(String[] args) {
		
		   ArrayList<String> al = new ArrayList<String>();  
	        al.add("Car");  
	        al.add("Bike");  
	        al.add("Man");  
	        al.add("Auto");  
	        System.out.println("Before Reversing");  
	        System.out.println(al);  
	          
	        Collections.reverse(al);  
	        System.out.println("After Reversing");  
	        System.out.println(al);  
	}

}
