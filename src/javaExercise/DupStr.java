package javaExercise;

import org.testng.Assert;

public class DupStr {

	public static void main(String[] args) {
		
		String str = "w3schools";
		int count = 0;
		char [] input = str.toCharArray();
		System.out.println("Duplicate Characters are : ");
		
		for(int i = 0; i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(input[i] == input[j]) {
					System.out.println(input[j]);
					count++;
					break;
				}
			}
		}
		System.out.println("number of dublicated Charachters is : " +count);
        Assert.assertEquals(2, count);
	}

}
