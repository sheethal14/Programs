class Stadium
{
 public  String name;
 public  int capacity;
 public String type;
 public String location;

 public Stadium(String name,int capacity,String type,String location)
 {
  System.out.println("Stadium object is created");
  this.name=name;
  this.capacity=capacity;
  this.type=type;
  this.location=location;
 }
 public void display()
 {
  System.out.println(name+" "+capacity+" "+type+" "+location);
 }
 public static void main(String a[])
 {
  Stadium stadium=new Stadium("Narendra Modi International Cricket Stadium",125000,"Outdoor","Gujurat");
  Stadium stadium1=new Stadium("Nehru Stadium",25000,"Both","Shimoga");
  Stadium stadium2=new Stadium("Sheethal International stadium",500000,"Both","Chikkamaglore");
  stadium.display();
  stadium1.display();
  stadium2.display();
 }
}