
public class Quiz implements Measurable
{
	private String name;
	private double grade;
	public Quiz(String name, double grade)
	{
		this.name=name;
		this.grade=grade;
	}
	public double getMeasure()
	{
		return grade;
	}
}
