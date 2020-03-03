import java.util.Scanner;

public class ComboLock
{
	private int lockNum1,lockNum2,lockNum3;
	private boolean lockStatus;
	private Scanner scan = new Scanner(System.in);
	public ComboLock(int num1, int num2, int num3)
	{
		lockNum1=num1;
		lockNum2=num2;
		lockNum3=num3;
		lockStatus=false;
	}
	public void attemptUnlock()
	{
		if(lockStatus==true)
		{
			System.out.println("The lock is already unlocked.");
		}
		else
		{
			boolean lockTry=true;
			int currentNum=0;
			System.out.println("Input the amount of ticks you want to move left.");
			currentNum=currentNum+scan.nextInt();
			if(currentNum!=lockNum1)
			{
				lockTry=false;
			}
			System.out.println("Input the amount of ticks you want to move right.");
			currentNum=currentNum-scan.nextInt();
			if(currentNum<0)
			{
				currentNum=currentNum+40;
			}
			if(currentNum!=lockNum2)
			{
				lockTry=false;
			}
			System.out.println("Input the amount of ticks you want to turn back left.");
			currentNum=currentNum+scan.nextInt();
			if(currentNum>39)
			{
				currentNum=currentNum-40;
			}
			if(currentNum!=lockNum3)
			{
				lockTry=false;
			}
			if(lockTry==false)
			{
				System.out.println("The lock won't budge.");
			}
			else
			{
				System.out.println("The lock clicks open.");
				lockStatus=true;
			}
		}
	}
	public void lockReset()
	{
		if(lockStatus==false)
		{
			System.out.println("The lock is already locked.");
		}
		else
		{
			lockStatus=false;
			System.out.println("The lock has been relocked.");
		}
	}
}
