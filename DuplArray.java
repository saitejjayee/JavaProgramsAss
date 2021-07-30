package com.JavaProg;

public class DuplArray {

	public static void main(String[] args) {
		
int[] i= {1,2,3,4,5,6,7,8,12,45,6,91};

for(int j=0;j<i.l;j++) {
	
	for(int k=j+1;k<i.l;k++) {
	
		if(i[j]==i[k]) {
					
			System.out.println("Duplicates found in array is "+i[j] + " at index " +j +" and "+
					+k);
		
		}
		}
	}


	}

}
