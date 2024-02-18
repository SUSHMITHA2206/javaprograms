package MovieDetails;

import java.util.*;

class Movie{
	String moviename;
	String Heroname;
	String Heroine;
	String Singer;
	String MusicDir;
	Movie(String moviename,String Heroname,String Heroine,String Singer,String MusicDir)
	{
		this.moviename=moviename;
		this.Heroname=Heroname;
		this.Heroine=Heroine;
		this.Singer=Singer;
		this.MusicDir=MusicDir;
	}
}
class MovieComparator implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2)
	{
		
			return (m1.moviename.compareTo(m2.moviename));

	}
}
class HeroComparator implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2)
	{
		
			return (m1.Heroname.compareTo(m2.Heroname));

	}
}
class HeroinComparator implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2)
	{
		
			return (m1.Heroine.compareTo(m2.Heroine));

	}
}
class SingerComparator implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2)
	{
		
			return (m1.Singer.compareTo(m2.Singer));

	}
}
class MusicComparator implements Comparator<Movie>{
	public int compare(Movie m1,Movie m2)
	{
		
			return (m1.MusicDir.compareTo(m2.MusicDir));

	}
}
class GFG{
public static void main(String[] args) {
		ArrayList<Movie> m=new ArrayList<Movie>();
		m.add(new Movie("Bahubali","Prabhas","Tamanna","revanth","M.M.Keeravani"));
		m.add(new Movie("RRR","NTR","Alia","Rahul","M.M.Keeravani"));
		m.add(new Movie("Bahubali-2","Prabhas","Anushka","revanth","M.M.Keeravani"));
		System.out.println("before sorting");
		for(Movie movie:m) {
			System.out.println(movie.moviename+" "+movie.Heroname+" "+movie.Heroine+" "+movie.Singer+" "+movie.MusicDir);
		}
			System.out.println();
			System.out.println("After sorting by movie names");
			m.sort(new MovieComparator());
			
		for(Movie movie:m) {
				System.out.println(movie.moviename+" "+movie.Heroname+" "+movie.Heroine+" "+movie.Singer+" "+movie.MusicDir);
			}
			System.out.println();
			System.out.println("After sorting by Hero names");
			m.sort(new HeroComparator());
			
			for(Movie movie:m) {
				System.out.println(movie.Heroname+" "+movie.moviename+" "+" "+movie.Heroine+" "+movie.Singer+" "+movie.MusicDir);
			}
			
			System.out.println();
			System.out.println("After sorting by Heroin names");
			m.sort(new HeroinComparator());
			
			for(Movie movie:m) {
				System.out.println(movie.Heroine+" "+movie.Heroname+" "+movie.moviename+" "+" "+movie.Singer+" "+movie.MusicDir);
			}
			
			System.out.println();
			System.out.println("After sorting by Singer names");
			m.sort(new HeroinComparator());
			
			for(Movie movie:m) {
				System.out.println(movie.Singer+" "+movie.Heroine+" "+movie.Heroname+" "+movie.moviename+" "+" "+movie.MusicDir);
			}

			System.out.println();
			System.out.println("After sorting by Music Director names");
			m.sort(new HeroinComparator());
			
			for(Movie movie:m) {
				System.out.println(movie.MusicDir+" "+movie.Singer+" "+movie.Heroine+" "+movie.Heroname+" "+movie.moviename+" "+" ");
			}
			
}
}