import java.util.Scanner;
class TeleUtil
{
static String details[]=new String[3];
static int age,amount;
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your name");
	String name=sc.next();
	System.out.println("Enter your address");
	String address=sc.next();
	System.out.println("Enter your aadhar");
	String aadhar=sc.next();
	details[0]=name;
	details[1]=address;
	details[2]=aadhar;
	System.out.println("enter your age");
	age=sc.nextInt();
	System.out.println("Enter amount");
	amount=sc.nextInt();
Tele.simCard(details,age,amount);
}
}