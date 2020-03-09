
public class Person 
{
	private String name;
	private int birthYear;
	public Person(String newName, int dob)
	{
		name = newName;
		birthYear=dob;
	}
	public String toString()
	{
		return "Name: "+name+", birth year: "+birthYear;
	}
}
