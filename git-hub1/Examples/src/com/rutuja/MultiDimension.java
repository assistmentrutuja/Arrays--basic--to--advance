package com.rutuja;

import java.util.Arrays;

public class MultiDimension {

	public static void main(String[] args) {
		
		 int[][] arr1= {
				 {1,2,3},
				 {4,5},
				 {6,7,8,9}
				 };
		 System.out.println(arr1.length);
		// for(int row=0;row<arr1.length;row++) {
			 //for(int col=0;col<arr1[row].length;col++) {
			//System.out.print(arr1[row][col] + " ");
		 
		 
				 // System.out.println(Arrays.toString(arr1[row]));
		 
		 
		 for(int[] a:arr1)
		 {
			 System.out.println(Arrays.toString(a));
			 }
			 
	}
	}


