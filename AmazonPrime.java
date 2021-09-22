class AmazonPrime
{
	static String movies[]={"Shreshah","RakthaCharitra","Robert","KGF2","Yuvaratna","Master","LightOut","JaathiRathnalu"};
	static String series[]={"Vampire Diaries","Originals","The last ship","Mirzapur","The Family man","Four more shots"};
	static String movie="Jolly Days";
	public static void main(String a[])
	{
		System.out.println("main method started");
		getMovies(movies);
		String movie1=getMovies(movie);
		System.out.println(movie1);
		getSeries(series);
	}
	public static void getMovies(String[] movies)
	{
		System.out.println("Movies are :");
		for(int i=0;i<movies.length;i++)
		{
			System.out.println(movies[i]);
		}
	}
	public static String getMovies(String movie)
	{
		System.out.println("\ninside getMovies method");
		return movie;
	}
	public static void getSeries(String[] series)
	{
		System.out.println("\nSeries are :");
		for(int i=0;i<series.length;i++)
		{
			System.out.println(series[i]);
		}
	}
}