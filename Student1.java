import java.util.Scanner;


public class Student1
{
	static int count;
	int rollno;
	String name;
	String address;	

	
	public static Student1 getData(Student1 s1,int count)
	{
		Scanner sc = new Scanner(System.in);
		
		for(int i=1;i<=count;i++)
		{
			System.out.println("Enter Student Roll No : ");
			s1.rollno=sc.nextInt();
			System.out.println("Enter Student Name : ");
			s1.name=sc.next();
			System.out.println("Enter Student Address : ");
			s1.address=sc.next();
			
		}
		return s1;
	}
	
	public static void displayData(Student1 s1)
	{
		System.out.println(" "+s1);
	}
	
	public static void main(String [] args)
	{
		Student1 s1 = new Student1();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter student count : ");
		count = sc.nextInt();
		
		for(int i=1;i<=count;i++)
			s1=getData(s1,count);
		displayData(s1);
		
		
		
	}
	
	
	public String toString()
	{
		return "\n RollNo : "+rollno+"\n Name :"+name+"\n Address : "+address;
	}
}
