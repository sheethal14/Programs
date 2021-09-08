class Tele
{
 public static void simCard(String details[],int age,int amount){

 if(age > 18)
 {
System.out.println("You are above 18,please pay for Sim Card");
 if(amount>=500)
 {
 System.out.println("Provide address and Other details");
  if(details != null)
  {
 
     getDetails(details);
      System.out.println("Sim card is issued");
   }
   else
   {
    System.out.println("Please provid valid details");
    }
   }
   else
   {
     System.out.println("Please give 500rs for Sim card");
    }
    
 }
else
{
System.out.println("You are not above 18");
}
}

 public static void getDetails(String details[])
 {
   for(int i=0; i< details.length; i++)
   { 
 	System.out.println(details[i]);
   }
 }
}