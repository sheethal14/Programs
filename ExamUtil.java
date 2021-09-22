import java.util.Scanner; 

class ExamUtil

{

	static String[] hallTicket=new String[3];
	public static void main(String a[])
	{
		System.out.println("main method started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Candidate Name");
		String candidateName=sc.next();
		System.out.println("Enter the USN");
		String usnNo=sc.next();
		System.out.println("Enter the Subject Name");
		String subjectName=sc.next();
		hallTicket[0]=candidateName;
		hallTicket[1]=usnNo;
		hallTicket[2]=subjectName;
		Exam.allow(hallTicket);
		Exam.allow(1295);
		System.out.println("main method ended");
	}
}