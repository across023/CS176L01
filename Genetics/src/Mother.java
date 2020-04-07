
public class Mother extends FamilyExpressions
{
	public String mFirstName;
	public String mGene[];
	public Mother(String[] ch, String[][] ex, String[] comb, String name, String[] gene)
	{
		super(ch,ex,comb);
		mFirstName=name;
		mGene = new String[5];
		mGene=gene;
	}
	public void changeMother(String[] m)
	{
		mGene=m;
	}
}
