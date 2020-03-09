
public class Instructor extends Person
{
	private double salary;
	public Instructor(String newName, int dob, double wage)
	{
		super(newName,dob);
		salary=wage;
	}
	public String toString()
	{
		return super.toString()+", salary: "+salary;
	}
}
