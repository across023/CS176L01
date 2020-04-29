import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class iCountNumbers
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file1 = new File("numbers.txt");
		Scanner scan = new Scanner(System.in);
		Scanner scanFile1 = new Scanner(file1);
		PrintWriter outWriter = new PrintWriter("sum.txt");
		double sum=0;
		while(scanFile1.hasNextDouble())
		{
			sum+=scanFile1.nextDouble();
		}
		outWriter.println(sum);
		scanFile1.close();
		outWriter.close();
	}
}
