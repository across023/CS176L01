
public class CashRegister 
{
	private double purchase;
	private double payment;
	public CashRegister()
	{
		purchase=0;
		payment=0;
	}
	public void recordPurchase(double newPurchase)
	{
		purchase+=newPurchase;
	}
	public void receivePayment(double newPayment)
	{
		payment+=newPayment;
	}
	public double giveChange()
	{
		return (payment-purchase);
	}
	public void calcDiscount(double DISCOUNT, double THRESHOLD)
	{
		if(purchase>THRESHOLD)
		{
			double previousPurchase=purchase;
			purchase=purchase-(purchase*DISCOUNT);
			System.out.printf("Your total purchases were %.2f",previousPurchase);
			System.out.print(" and because you spent over "+THRESHOLD+" you are entitled to a "+DISCOUNT*100);
			System.out.printf(" percent discount of %.2f",previousPurchase*DISCOUNT);
			System.out.printf(" reducing your balance to %.2f",purchase);
			System.out.println();
		}
	}
}
