class MusicalInstUtil
{
	public static void main(String a[])
	{
		MusicalInstruments music=new MusicalInstruments();
		music.name="Guitar";
		music.price=4000.50;
		music.frequency="20Hz";
		music.type="Western";
		System.out.println(music.name+" "+music.price+" "+music.frequency+" "+music.type);

		music.play(music.name);

		System.out.println();

		MusicalInstruments music1=new MusicalInstruments();
		music1.name="Violin";
		music1.price=4999.50;
		music1.frequency="10Hz";
		music1.type="Don't know";
		System.out.println(music1.name+" "+music1.price+" "+music1.frequency+" "+music1.type);

		music1.play(music1.name);
	}
}