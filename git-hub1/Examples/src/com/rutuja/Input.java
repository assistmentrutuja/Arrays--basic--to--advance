package com.rutuja;

import java.util.Arrays;
import java.util.Scanner;

public class Input {

    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	
    	//Arrays of primitive
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 34;
        arr[3] = 45;
        arr[4] = 56;
        System.out.println(arr[3]);
      
        
         //using for loop
        for(int i=0;i<arr.length;i++)
        System.out.println("Element in index is:"+ i+":"+arr[i]);
        
        
        
       // enhance or loop 
        for(int num:arr)// for every element in arrays print the element  {
        	System.out.println("The num is:"+":"+num); //num is element in array 
        
        
        
        //System.out.println(arr[5]);// array index out of bound 
        
        // using tiString() method
        System.out.println("The elements in arrays are:"+Arrays.toString(arr));
        
        //Arrays of objects
        String[] arr1=new String[5];
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Enter a string for index " + i + ": ");
            arr1[1]="rutuja";
            arr1[i] = sc.next();
        }
        System.out.println("Array elements: " + Arrays.toString(arr1));
   

}
}


    

       