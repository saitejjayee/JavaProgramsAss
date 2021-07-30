package com.JavaProg;

import java.util.*;


public class Phoneprog {

	public static void main(String[] args) {
JavaPro<Integer,String> jp = new JavaPro<Integer,String>();
jp.put(1, "iphone");
jp.put(2, "micromax");
jp.put(3, "celkon");
jp.put(4, "sony");
 ArrayList<Integer> keys=new ArrayList<Integer>(jp.keySet());
 ArrayList<String>Values=new ArrayList<String>(jp.values());
 System.out.println(keys);
 System.out.println(Values);
 
 
	}

}
