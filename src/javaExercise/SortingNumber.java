package javaExercise;

import org.testng.Assert;

public class SortingNumber {

	public static void main(String[] args) {
		int a [] = {34,4,44,9,5,56};
		int expectedArr [] = {4,5,9,34,56,44}; 
		int temp;
       for (int i = 0 ; i<a.length;i++) 
       {
    	   for(int j=i+1;j<a.length;j++)
    	   {
    		   if(a[i]>a[j])
    		   {
    			   temp = a[i];
    			   a[i]=a[j];
    			   a[j]=temp;
    			   
    		   }
    	   }
       }
       for(int i = 0 ; i<a.length;i++) {
    	   System.out.print(a[i] + ";");
       }
       
       Assert.assertEquals(expectedArr, a);
   
}
}
