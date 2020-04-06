
public class Student extends Person
{
	private String major;
	public Student(String newName, int dob, String theirMajor)
	{
		super(newName,dob);
		major=theirMajor;
	}
	public String toString()
	{
		return super.toString()+", major: "+major;
	}
}
