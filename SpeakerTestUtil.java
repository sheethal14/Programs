import java.util.Scanner;
class SpeakerTestUtil
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		Speaker.onOrOff();
		boolean isConnected=Speaker.onOrOff();
		System.out.println("The Speaker is Connected" +isConnected);
		int a=5;
		while(a!=2)
		{
			System.out.println("Press 1 for increase volume OR press 0 for decrease volume OR Press 2 for exit");
			a=sc.nextInt();
			if(a==1)
			{
				Speaker.increaseVolume();
			}
			else if(a==0)
			{
				Speaker.decreaseVolume();
			}
			else if(a==2)
			{
				break;
			}
			else
			{
				System.out.println("Enter proper key");
			}
		}
	}

}