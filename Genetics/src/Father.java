
public class Father 
{
	public String fFirstName;
	public String fGene[];
	public Father(String name, String[] gene)
	{
		fFirstName=name;
		fGene = new String[5];
		fGene=gene;
	}
	public void changeFather(String[] f)
	{
		fGene=f;
	}
}
