
public class FamilyExpressions extends Characteristics
{
	private String expression[][];
	private String combination[];
	public FamilyExpressions(String[] ch, String ex[][], String comb[])
	{
		super(ch);
		expression = new String[5][4];
		expression=ex;
		combination = new String[4];
		combination=comb;
	}
}
