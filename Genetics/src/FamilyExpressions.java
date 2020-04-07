
public class FamilyExpressions extends Characteristics
{
	public String expression[][];
	public String combination[];
	public FamilyExpressions(String[] ch, String ex[][], String comb[])
	{
		super(ch);
		expression = new String[5][4];
		expression=ex;
		combination = new String[4];
		combination=comb;
	}
}
