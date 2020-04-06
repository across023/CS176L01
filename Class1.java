package edu.monmouth.cs176.s1239598.mp2;

import java.util.Scanner;

public class Class1 
{
	private String[] phrases;
	private int numEntries=0;
	private Scanner scan = new Scanner(System.in);
	public Class1(int numOfIndexes)
	{
		phrases = new String[numOfIndexes];
	}
	public void load()
	{
		String p = new String("");
		System.out.println("Enter the strings you want, enter \"done\" to quit.");
		for(int i=0;i<phrases.length && !(p.equals("done"));i++)
		{
			p=scan.next();
			if(!(p.equals("done")));
			{
				phrases[i]=p;
				numEntries++;
			}
		}
	}
	public boolean search(String inWord)
	{
		boolean isThere=false;
		for(int i=0;i<numEntries && isThere!=true;i++)
		{
			if(phrases[i].equals(inWord))
			{
				isThere=true;
			}
		}
		return isThere;
	}
	public String findMax()
	{
		String max=phrases[0];
		for(int i=1;i<numEntries;i++)
		{
			if(phrases[i].compareToIgnoreCase(max)>0)
			{
				max=phrases[i];
			}
		}
		return max;
	}
	public String findMin()
	{
		String min=phrases[0];
		for(int i=1;i<numEntries;i++)
		{
			if(phrases[i].compareToIgnoreCase(min)<0)
			{
				min=phrases[i];
			}
		}
		return min;
	}
	public String findLongest()
	{
		String longest=phrases[0];
		for(int i=1;i<numEntries;i++)
		{
			if(phrases[i].length()>longest.length())
			{
				longest=phrases[i];
			}
		}
		return longest;
	}
	public String findShortest()
	{
		String shortest=phrases[0];
		for(int i=1;i<numEntries;i++)
		{
			if(phrases[i].length()<shortest.length())
			{
				shortest=phrases[i];
			}
		}
		return shortest;
	}
}
