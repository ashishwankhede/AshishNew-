import java.util.Scanner;


public class Student
{
	static int count;
	int rollno;
	String name;
	
	
	public static Student getData(Student s1,int count)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter Student Roll No : ");
			s1.rollno=sc.nextInt();
			System.out.println("Enter Student Name : ");
			s1.name=sc.next();
		}
		return s1;
	}
	
	public static void displayData(Student s1)
	{
		System.out.println(" "+s1);
	}
	
	public static void main(String [] args)
	{
		Student s1 = new Student();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student count : ");
		count = sc.nextInt();
		
		for(int i=1;i<=count;i++)
			s1=getData(s1,count);
		displayData(s1);
		
		
		
	}
	
	
	public String toString()
	{
		return "\n RollNo : "+rollno+"\n Name :"+name;
	}
}
