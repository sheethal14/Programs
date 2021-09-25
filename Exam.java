class Exam
{
 public  String univName;
 public  int fees;

 public Exam(String univName,int fees)
 {
  System.out.println("Exam object is created");
  this.univName=univName;
  this.fees=fees;
 }
 public void display()
 {
  System.out.println(univName+" "+fees);
 }
 public static void main(String a[])
 {
  Exam exam=new Exam("VTU",1295);
  exam.display();
 }

 
}