package edu.monmouth.cs176.s1239598.mp2;

import java.util.Scanner;

public class Tester1 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of your array of words.");
		Class1 words = new Class1(scan.nextInt());
		words.load();
		System.out.println("Input a word that is in the array.");
		boolean isIn=words.search(scan.next());
		System.out.println("The existence of that word is "+isIn);
		System.out.println("Now input a word that is not in the array.");
		boolean isntIn=words.search(scan.next());
		System.out.println("The existence of that word is "+isntIn);
		System.out.println("The highest word is "+words.findMax());
		System.out.println("The lowest word is "+words.findMin());
		System.out.println("The longest word is "+words.findLongest());
		System.out.println("The shortest word is "+words.findShortest());
	}
}
