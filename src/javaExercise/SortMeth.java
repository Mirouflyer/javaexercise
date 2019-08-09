package javaExercise;

import java.util.Arrays;

import org.testng.Assert;


public class SortMeth {
	
	public static void main(String [] args)
{
		int [] arr = {3,2,9,4,7,10,5,8,6,0};
		int [] expectedArr = {0,2,3,4,5,6,7,8,9,10};
		
		Arrays.sort(arr);
		for(int i =0;i<=arr.length;i++) {
			System.out.print(i+"; ");
		}
		Assert.assertEquals(expectedArr, arr);
	
	}

}
