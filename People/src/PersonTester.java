
public class PersonTester
{
	public static void main(String[] args) 
	{
		Person p1 = new Person("John",1965);
		Person p2 = new Person("Mary Ann",1970);
		Student s1 = new Student("Ann",1982,"Computer Science");
		Student s2 = new Student("Thomas",1986,"Biology");
		Instructor i1 = new Instructor("Joseph",1954,65000);
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(i1);
	}
}
