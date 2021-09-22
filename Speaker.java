class Speaker
{
	static String name="boAt";
	static int minVolume=0;
	static int maxVolume=7;
	static boolean isConnected=false;
	static int currentVolume;
	public static boolean onOrOff()
	{
		if(isConnected==false)
		{
			isConnected=true;
			return isConnected;
		}
		else if(isConnected==true)
		{
			isConnected=false;
			return isConnected;
		}
		else
		{
			return isConnected;
		}
	}
	public static void increaseVolume()
	{
		if(isConnected)
		{
			if(currentVolume<maxVolume)
			{
				currentVolume=currentVolume+1;
				System.out.println("the currentVolume is :" +currentVolume);
			}
			else
			{
				System.out.println("max Volume reached");
			}

		}
		else
		{
			System.out.println("Speaker is not connected");
		}
	}
	public static void decreaseVolume()
	{
		if(isConnected)
		{
			if(currentVolume>minVolume)
			{
				currentVolume=currentVolume-1;
				System.out.println("the currentVolumeis : "+currentVolume);
			}
			else
			{
				System.out.println("min Volume reached");
			}
		}
		else
		{
			System.out.println("Speaker is not connected");
		}
	}
}