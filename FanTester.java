class FanTester
{
	public static void main(String[] args) {
		Fan fan=Fan.getFan();
		System.out.println(fan);
		Fan fan1=Fan.getFan();
		System.out.println(fan1);

		Fan fan2=new Fan();
		System.out.println(fan2);
		Fan fan3=new Fan();
		System.out.println(fan3);
	}
}