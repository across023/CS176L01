
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
	public boolean seatLookup(int secNum, int rowNum, int seatNum)
	{
		boolean isTaken;
		if(allSeats[secNum][rowNum][seatNum]==false)
		{
			allSeats[secNum][rowNum][seatNum]=true;
			isTaken=false;
		}
		else
		{
			isTaken=true;
		}
		return isTaken;
	}
}
