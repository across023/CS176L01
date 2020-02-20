import java.util.Random;

public class VenueTester 
{
	public static void main(String[] args) 
	{
		Random generator = new Random();
		int SECTIONS=4;
		int ROWS=5;
		int SEATS=10;
		Venue place = new Venue(SECTIONS,ROWS,SEATS);
		for(int l=0;l<100;l++)
		{
			int i=generator.nextInt(SECTIONS);
			int j=generator.nextInt(ROWS);
			int k=generator.nextInt(SEATS);
			if(!place.seatLookup(i,j,k))
			{
				System.out.println((i+1)+"-"+(j+1)+"-"+(k+1)+" seat available");
			}
			else
			{
				System.out.println((i+1)+"-"+(j+1)+"-"+(k+1)+" seat Taken");
			}
		}
	}
}
