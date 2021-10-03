class EngineerTester
{
	public static void main(String args[])
	{
		
		Electrical ee=new Electrical();
		ee.name="Ramesh";
		ee.branch="EEE";
		ee.company="L&T";
		ee.salary=50000;

		String dis1 =ee.solveProblem();
		System.out.println(dis1);
		ee.display();

		Civil ce=new Civil();
		ce.name="Suresh";
		ce.branch="CE";
		ce.company="BLK";
		ce.salary=25000;

		String dis2 =ce.solveProblem();
		System.out.println(dis2);
		ce.display();

		Mechanical me=new Mechanical();
		me.name="Ravi";
		me.branch="ME";
		me.company="kirloskar";
		me.salary=30000;

		String dis3 =me.solveProblem();
		System.out.println(dis3);
		me.display();

		ComputerScience cs=new ComputerScience();
		cs.name="Raghu";
		cs.branch="CSE";
		cs.company="Google";
		cs.salary=80000;

		String dis4 =cs.solveProblem();
		System.out.println(dis4);
		cs.display();

		Electronics ec=new Electronics();
		ec.name="Rakshith";
		ec.branch="ECE";
		ec.company="TCS";
		ec.salary=40000;

		String dis5 =ec.solveProblem();
		System.out.println(dis5);
		ec.display();
	}
}