package edu.monmouth.cs176.s1239598.mp2;

import java.util.Scanner;

public class Class2 
{
	private int[] intArray;
	private int numEntries=0;
	private Scanner scan = new Scanner(System.in);
	public Class2(int numOfIndexes)
	{
		intArray = new int[numOfIndexes];
	}
	public void load()
	{
		int n=0;
		for(int i=0;i<intArray.length && n!=-999;i++)
		{
			System.out.println("Enter a number or -999 to break.");
			n=scan.nextInt();
			if(n!=-999)
			{
				intArray[i]=n;
				numEntries++;
			}
		}
	}
	public boolean search(int inNum)
	{
		boolean isThere=false;
		for(int i=0;i<numEntries && isThere!=true;i++)
		{
			if(intArray[i]==inNum)
			{
				isThere=true;
			}
		}
		return isThere;
	}
	public int findMax()
	{
		int max=intArray[0];
		for(int i=1;i<numEntries;i++)
		{
			if(intArray[i]>max)
			{
				max=intArray[i];
			}
		}
		return max;
	}
	public int findMin()
	{
		int min=intArray[0];
		for(int i=1;i<numEntries;i++)
		{
			if(intArray[i]<min)
			{
				min=intArray[i];
			}
		}
		return min;
	}
	public int findMaxPos()
	{
		int max=intArray[0];
		int maxPos=0;
		for(int i=1;i<numEntries;i++)
		{
			if(intArray[i]>max)
			{
				max=intArray[i];
				maxPos=i;
			}
		}
		return maxPos;
	}
	public int findMinPos()
	{
		int min=intArray[0];
		int minPos=0;
		for(int i=1;i<numEntries;i++)
		{
			if(intArray[i]<min)
			{
				min=intArray[i];
				minPos=i;
			}
		}
		return minPos;
	}
}
