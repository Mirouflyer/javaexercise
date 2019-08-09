package javaExercise;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println("Enter String to reverse : ");
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String reverse = "";
		
		for(int i = str.length()-1;i>=0;i--){
			reverse = reverse + str.charAt(i);
		}
		System.out.println("Reversed String is : ");
		System.out.println(reverse);
        scan.close(); 
	}

}
