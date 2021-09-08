class Exam
{
 public static String univName = "VTU";
 public static String hallTicket[] = {"Sheethal Gowda B M", "4JN17EE041", "Java Core"};
 public static int fees = 1295;

 public static boolean allow(String hallTicket[])
{

 boolean allowedToWrite = false;
 if(fees > 1200)
 {
  if(hallTicket != null)
  {
    allowedToWrite = true;
    getHallTicket(hallTicket);
    return allowedToWrite;
   }
   else
   {
    System.out.println("No Hallticket!!!! Cannot allowed");
    }
   }
   else
   {
     System.out.println("Fees katto Gubaal");
    }
    return allowedToWrite;
 }
 public static void getHallTicket(String hallTicket[])
 {
   for(int i=0; i< hallTicket.length; i++)
   { 
 	System.out.println(hallTicket[i]);
   }
 }
}