class ShowRoom
{
 public  String name;
 public String product;
 public String location;
 public double rating;

 public ShowRoom(String name,String product,String location,double rating)
 {
  System.out.println("ShowRoom object is created");
  this.name=name;
  this.product=product;
  this.location=location;
  this.rating=rating;
 }
 public void display()
 {
  System.out.println(name+" "+product+"  "+location+" "+rating);
 }
 public static void main(String a[])
 {
  ShowRoom showRoom=new ShowRoom("Trident Hyudai ShowRoom","Car","Rajajinagar",4.0);
  ShowRoom showRoom1=new ShowRoom("MG Motor India","Car","Chord road Rajajinagar",4.1);
  showRoom.display();
  showRoom1.display();
 }

 
}