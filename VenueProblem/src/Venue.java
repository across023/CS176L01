
public class Venue 
{
	private boolean[][][] allSeats;
	public Venue(int numSecs, int numRows, int numSeats)
	{
		allSeats = new boolean[numSecs][numRows][numSeats];
		for(int i=0;i<numSecs;i++)
		{
			for(int j=0;j<numRows;j++)
			{
				for(int k=0;k<numSeats;k++)
				{
					allSeats[i][j][k]=false;
				}
			}
		}
	}
	public void seatLookup(int secNum, int rowNum, int seatNum)
	{
		if(allSeats[secNum][rowNum][seatNum]==false)
		{
			allSeats[secNum][rowNum][seatNum]=true;
			System.out.println(secNum+"-"+rowNum+"-"+seatNum+" seat awarded");
		}
		else
		{
			System.out.println(secNum+"-"+rowNum+"-"+seatNum+" seat taken");
		}
	}
}
