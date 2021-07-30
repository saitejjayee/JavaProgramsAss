package com.JavaProg;
import java.util.*;  

public class HashTab {

	public static void main(String[] args) {
		
		 Hashtab<Integer,String> h=new Hashtab<Integer,String>();  
		  
		  h.put(100,"Anil");  
		  h.put(102,"Raj");  
		  h.put(101,"Vinay");  
		  h.put(103,"Rohit");  
		  
		   System.out.println(h.keySet());  
		 
	}

}
