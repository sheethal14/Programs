import java.util.Scanner;
class ElectionUtil
{
static String details[]=new String[3];
static int age;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=sc.next();
	System.out.println("Enter your Address");
	String address=sc.next();
	System.out.println("Enter your Phone number");
	String phoneNumber=sc.next();
	details[0]=name;
	details[1]=address;
	details[2]=phoneNumber;
	Scanner sc1=new Scanner(System.in);
	System.out.println("Enter your  age");
	age=sc1.nextInt();
Election.electionCard(details,age);
}
}