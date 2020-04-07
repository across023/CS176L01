import java.util.Random;

public class Child
{
	public static void main(String[] args) 
	{
		Random gene = new Random();
		String[] M = new String[5];
		String[] F = new String[5];
		String[] noValues = new String[5];
		String[][] exp = {{"Brown","Blue","Green","Grey"},{"Brown","Black","Blonde","Red"},{"Male","Female","Female","Male"},{"6.5","6.0","5.5","5.0"},{"normal","near","far","color"}};
		String[] comb = {"DD","RR","DR","RD"};
		String[] ch = {"Eye color","Hair color","Sex","Height","Vision"};
		Mother mother = new Mother(ch,exp,comb,"mom",noValues);
		Father father = new Father("dad",noValues);
		String[] mGenes = new String[4];
		String[] fGenes = new String[4];
		for(int i=0;i<4;i++)
		{
			int newGene=gene.nextInt(100)+1;
			if(newGene<51)
			{
				mGenes[i]="D";
			}
			else
			{
				mGenes[i]="R";
			}
			newGene=gene.nextInt(100)+1;
			if(newGene<51)
			{
				fGenes[i]="D";
			}
			else
			{
				fGenes[i]="R";
			}
		}
		mother.changeMother(mGenes);
		father.changeFather(fGenes);
	}
}
