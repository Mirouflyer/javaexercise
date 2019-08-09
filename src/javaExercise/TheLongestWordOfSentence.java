package javaExercise;

import java.util.Scanner;

import org.testng.Assert;

public class TheLongestWordOfSentence {
	
	public static String compare(String str1, String str2) {
		if(str1.length()>str2.length()) {
			return str1;
		}else return str2; 
	}

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a sentence : ");
		String sentence = sc.nextLine() ;
		System.out.println(sentence);
		String [] sent = sentence.split(" ");
		String word = null ;
		
		for(int i = 0;i<sent.length; i++) {
			if(i==0) {
				word = sent[0];
			}
			word = compare(word,sent[i]);
		}
		
		System.out.println("The longest word is : " + word);
		System.out.println("The length of the largest word is : " + word.length());
		
		//String sentence = "The cow jumped over the moon";
		//String [] sentArray = sentence.split(" ");
//		for(String word : sentArray) {
//			System.out.println(word);
//		}
//		 System.out.println(sentArray.length);
		Assert.assertEquals("recursively", word);
		Assert.assertEquals(11, word.length());
		sc.close();
       }
       
	

}
