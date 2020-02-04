import java.util.Scanner;

public class CashRegisterTester 
{
	public static void main(String[] args) 
	{
		CashRegister register = new CashRegister();
		final double SENTINEL = -1;
		final double DISCOUNT = .10;
		final double MINIMUMPURCHASE = 50;
		double itemValue=0;
		Scanner scan =  new Scanner(System.in);
		while(itemValue!=SENTINEL)
		{
			System.out.println("Enter the value of your item or enter -1 to move on to payment.");
			itemValue=scan.nextDouble();
			if(itemValue!=SENTINEL)
			{
				register.recordPurchase(itemValue);
			}
		}
		register.calcDiscount(DISCOUNT, MINIMUMPURCHASE);
		System.out.println("Please enter payment.");
		register.receivePayment(scan.nextDouble());
		double change=register.giveChange();
		System.out.printf("Your change is %.2f",change);
	}

}
