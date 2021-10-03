class MncTester
{
	public static void main(String args[])
	{
		
		Accenture acc=new Accenture();
		acc.name="Accenture";
		acc.founded="1989";
		acc.employee=300000;
		acc.worth="120 billion";

		String dis1 =acc.service();
		System.out.println(dis1);
		acc.display();

		Amazon am=new Amazon();
		am.name="Amazon";
		am.founded="1994";
		am.employee=100000;
		am.worth="672 billion";

		String dis2 =am.service();
		System.out.println(dis2);
		am.display();

		Apple ap=new Apple();
		ap.name="Apple";
		ap.founded="1977";
		ap.employee=800000;
		ap.worth="160 billion";

		String dis3 =ap.service();
		System.out.println(dis3);
		ap.display();

		Citygroup cg=new Citygroup();
		cg.name="Citygroup";
		cg.founded="1998";
		cg.employee=260000;
		cg.worth="70 billion";

		String dis4 =cg.service();
		System.out.println(dis4);
		cg.display();

		Dell de=new Dell();
		de.name="Dell";
		de.founded="1984";
		de.employee=165000;
		de.worth="94 billion";

		String dis5 =de.service();
		System.out.println(dis5);
		de.display();

		Hewlett he=new Hewlett();
		he.name="Helwett";
		he.founded="1939";
		he.employee=53000;
		he.worth="34 billion";

		String dis6 =he.service();
		System.out.println(dis6);
		he.display();

		Ibm ib=new Ibm();
		ib.name="IBM";
		ib.founded="1911";
		ib.employee=140000;
		ib.worth="100 billion";

		String dis7 =ib.service();
		System.out.println(dis7);
		ib.display();

		Intel it=new Intel();
		it.name="Intel";
		it.founded="1968";
		it.employee=110600;
		it.worth="53 billion";

		String dis8 =it.service();
		System.out.println(dis8);
		it.display();

		Lenova le=new Lenova();
		le.name="Lenova";
		le.founded="1984";
		le.employee=71500;
		le.worth="60 billion";

		String dis9 =le.service();
		System.out.println(dis9);
		le.display();

		Microsoft ms=new Microsoft();
		ms.name="Microsoft";
		ms.founded="1975";
		ms.employee=150000;
		ms.worth="78 billion";

		String dis10 =ms.service();
		System.out.println(dis10);
		ms.display();

		Mylan ml=new Mylan();
		ml.name="Mylan";
		ml.founded="1980";
		ml.employee=35000;
		ml.worth="3 billion";

		String dis11 =ml.service();
		System.out.println(dis11);
		ml.display();

		Procter pr=new Procter();
		pr.name="Procter";
		pr.founded="1837";
		pr.employee=125000;
		pr.worth="90 billion";

		String dis12 =pr.service();
		System.out.println(dis12);
		pr.display();

		Sap sp=new Sap();
		sp.name="Sap";
		sp.founded="1986";
		sp.employee=800000;
		sp.worth="160 billion";

		String dis13 =sp.service();
		System.out.println(dis13);
		sp.display();

		Sony sy=new Sony();
		sy.name="Sony";
		sy.founded="1946";
		sy.employee=150000;
		sy.worth="80 billion";

		String dis14 =sy.service();
		System.out.println(dis14);
		sy.display();

		Toyota tt=new Toyota();
		tt.name="Toyota";
		tt.founded="1868";
		tt.employee=500000;
		tt.worth="50 billion";

		String dis15 =tt.service();
		System.out.println(dis15);
		tt.display();
	}
}