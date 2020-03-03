package edu.monmouth.cs176.s1239598.mp2;

import java.util.Scanner;

public class Tester2 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How large do you want the array to be?");
		Class2 ourArray = new Class2(scan.nextInt());
		ourArray.load();
		System.out.println("The max is "+ourArray.findMax()+" in position "+ourArray.findMaxPos()+".");
		System.out.println("The min is "+ourArray.findMin()+" in position "+ourArray.findMinPos()+".");
		System.out.println("What number would you like to check for?");
		boolean isExist=ourArray.search(scan.nextInt());
		System.out.println("The number's existence is "+isExist);
	}
}
