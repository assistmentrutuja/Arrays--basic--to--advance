package com.rutuja;

import java.lang.reflect.Array;
import java.util.Arrays;

public class PassInFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,20,30,40,50,60};
		changes(arr);
		
		System.out.println(Arrays.toString(arr));
	}
	static void changes(int[] arr1) {
		arr1[3]=456;
		arr1[2]=143;
		
	}
	
}
		