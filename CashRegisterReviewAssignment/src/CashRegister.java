
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
}
