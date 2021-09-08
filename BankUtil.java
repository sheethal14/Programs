import java.util.Scanner;
class BankUtil
{
static String details[]=new String[3];
static int applicationFees;
public static void main(String a[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter your name");
String name=sc.next();
System.out.println("Enter Aadhar number");
String aadharNumber=sc.next();
System.out.println("Enter PAN card number");
String panCardNumber=sc.next();
details[0]=name;
details[1]=aadharNumber;
details[2]=panCardNumber;
System.out.println("Enter fee paid for application");
Scanner sc1=new Scanner(System.in);
applicationFees=sc1.nextInt();
System.out.println("");
Bank.acc(details,applicationFees);
}
}